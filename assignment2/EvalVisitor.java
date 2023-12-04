// Importing necessary libraries
import java.util.HashMap;             // Provides a hash table (map) implementation
import java.util.List;               // Represents an ordered collection (list)
import java.util.Map;                // Interface for a key-value map
import java.util.regex.Pattern;      // Provides regular expression pattern matching
import java.util.function.Function;  // Represents a single function that accepts one argument and produces a result
import javax.management.RuntimeErrorException;  // Indicates runtime exceptions for Java Management Extensions (JMX)


//class for evaluator visitor extending from CCALBaseVisitor
public class EvalVisitor extends CCALBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<>(); //memory to store variable and constant values
    Map<String, Function> function = new HashMap<>(); //map to store function defs
    SymbolTable st = new SymbolTable(); //manages symbols and scopes
    private boolean inFunc = false; //tracks visitor if its in a function
    
    // Visit assignment statements
    public Integer visitAssignmentStatement(CCALParser.AssignmentStatementContext context) {
        String id = context.ID().getText();  // Get the identifier from the assignment statement
        int value = visit(context.expression());  // Visit the expression to get the assigned value
        if (inFunc)
            id = "#" + id;  // If inside a function, prepend '#' to the identifier
        st.checkConstError(id);  // Check for constant error in the identifier
        memory.put(id, value);  // Update memory with the assigned value for the identifier
        return value;  // Return the assigned value
    }


    // Visit variable declaration
    public Integer visitVar_decl(CCALParser.Var_declContext context){
        String id = context.ID().getText();  // Get the identifier from the variable declaration
        String type = context.type().getText();  // Get the type of the variable
        if(type.equalsIgnoreCase("void")) throw new RuntimeErrorException(null, String.format("Error: Variable %s cannot be void", id));
        Integer value = null;  // Initialize the variable value to null (not assigned)
        if(inFunc){ 
            id = '#' + id;  // If inside a function, prepend '#' to the identifier
            if(memory.containsKey(id))
                throw new RuntimeErrorException(null, String.format("Error: Variable %s is already defined", id));
            st.addSymbol(id, type, "local", "variable");  // Add the variable symbol to the local scope
        }
        else {
            if(memory.containsKey(id))
                throw new RuntimeErrorException(null, String.format("Error: Variable %s is already defined", id));
            st.addSymbol(id, type, "global", "variable");  // Add the variable symbol to the global scope
        }
        memory.put(id, value);  // Update memory with the variable and its initial value
        return value;  // Return the initial value (null)
    }

    // Visit constant declaration
    public Integer visitConst_decl(CCALParser.Const_declContext context){
        String type = context.type().getText();  // Get the type of the constant
        String id = context.ID().getText();  // Get the identifier of the constant
        if(type.equalsIgnoreCase("void")) throw new RuntimeErrorException(null, String.format("Error: Constant %s cannot be void", id));
        Integer value = visit(context.expression());  // Get the value of the constant by visiting its expression
        String expr = context.expression().getText().split("\\(")[0];  // Extract the expression text without function calls
        st.compareTypeValue(type, expr); // Check for type and value compatibility in the symbol table
        if(inFunc){
            id = '#' + id;  // If inside a function, prepend '#' to the identifier
            if(memory.containsKey(id))
                throw new RuntimeErrorException(null, String.format( "Error: Constant %s is already defined", id));
            st.addSymbol(id, type, "local", "constant");  // Add the constant symbol to the local scope
        }
        else{
            if(memory.containsKey(id))
                throw new RuntimeErrorException(null, String.format("Error: Constant %s is already defined", id));
            st.addSymbol(id, type, "global", "constant");  // Add the constant symbol to the global scope
        }
        memory.put(id, value);  // Update memory with the constant and its value
        return value;  // Return the value of the constant
    }


    // Visit if-else statements
    public Integer visitIfElseStatement(CCALParser.IFElseStatementContext context){
        if(this.visit(context.condition()) == 1){  // Check the condition, if true
            visit(context.statement_block(0));  // Visit the first statement block
        }
        else if(context.statement_block(1) != null){  // If condition is false and there is an else block
            visit(context.statement_block(1));  // Visit the second (else) statement block
        }
        return 1;  // Return 1, indicating the completion of the if-else statement
    }

    // Visit while statements
    public Integer visitWhileStatement(CCALParser.WhileStatementContext context){
        while(visit(context.condition()) == 1){  // Continue looping while the condition is true
            visit(context.statement_block());  // Visit the statement block inside the while loop
        }
        return 0;  // Return 0, indicating the completion of the while statement
    }

    // Static nested class representing a custom function implementing the Function interface
    public static class MyFunction implements Function<Integer, Integer> {
        private CCALParser.Parameter_listContext params;  // Parameters of the function
        private CCALParser.Decl_listContext declList;  // Declaration list of the function
        private CCALParser.Statement_blockContext block;  // Statement block of the function
        private CCALParser.ExpressionContext expr;  // Expression of the function

        // Constructor to initialize the function's components
        public MyFunction(
                CCALParser.Parameter_listContext params,
                CCALParser.Decl_listContext declList,
                CCALParser.Statement_blockContext block,
                CCALParser.ExpressionContext expr
        ) {
            this.params = params;
            this.declList = declList;
            this.block = block;
            this.expr = expr;
        }

        @Override
        public Integer apply(Integer o) {
            // Implement the apply method as needed
            return null;  // Return null (placeholder), as the implementation is not provided
        }
    }


    // Visit function declarations
    public Integer visitFunction(CCALParser.FunctionContext context) {
        String id = context.ID().getText();  // Get the function identifier
        String type = context.type().getText();  // Get the return type of the function
        CCALParser.Parameter_listContext params = context.parameter_list();  // Get the parameters of the function
        CCALParser.Decl_listContext decList = context.decl_list();  // Get the declaration list of the function
        CCALParser.Statement_blockContext block = context.statement_block();  // Get the statement block of the function
        CCALParser.ExpressionContext expr = context.expression();  // Get the expression of the function
        
        st.addSymbol(id, type, "global", "function");  // Add function symbol to the symbol table and store function
        
        // Create a new instance of MyFunction (a custom function class) with function components
        Function func = (Function) new MyFunction(params, decList, block, expr);  // Use MyFunction, not myFunction
        function.put(id, func);  // Store the function in the function map
        return 1;  // Return 1, indicating the completion of the function visit
    }

    // Visit function call statements
    public Integer visitFunctionCallStatement(CCALParser.FunctionCallStatementContext context){
        inFunc = true;  // Set inFunc to true, indicating the visitor is inside a function
        st.enterScope();  // Enter a new scope in the symbol table
        
        String id = context.ID().getText();  // Get the function identifier
        String args = context.arg_list().getText();  // Get the argument list of the function call
        String[] arglist = args.split(".");  // Split the argument list into individual arguments
        
        // Handle the case where the argument list is empty
        if(arglist[0].isEmpty())
            arglist = new String[]{};
        
        // Check if the function exists in the function map
        if(!function.containsKey(id))
            throw new RuntimeErrorException(null, String.format("Error: Function %s is not defined", id));
        
        // Get the function details from the function map
        MyFunction func = (EvalVisitor.MyFunction)function.get(id);
        
        // Check if the number of arguments matches the number of function parameters
        if (arglist.length != ((List<?>) func.params.accept(this)).size())
            throw new RuntimeErrorException(null, String.format("Error: %s call requires %d arguments but received %d", id, func.params.size(), arglist.length));
        
        // Assign arguments to function parameters
        for(int i = 0; i < arglist.length; i++){
            String argID = arglist[i];
            param param = func.params.get(i);
            int argvalue = memory.get(argID);
            String paramID = param.id;
            
            // If inside a function, prepend '#' to the parameter ID
            if(inFunc){
                paramID = "#" + paramID;
            }
            
            memory.put(paramID, argvalue);  // Update memory with the argument value
            st.addSymbol(paramID, param.type, "local", "variable");  // Add the parameter to the local symbol table
        }
        
        visit(func.declList);  // Visit the declaration list of the function
        visit(func.block);  // Visit the statement block of the function
        
        List<String> IDList = st.exitScope();  // Exit the current scope and get the list of local variable IDs
        
        // Remove local variables from memory
        for(String localID:IDList){
            memory.remove(localID);
        }
        
        inFunc = false;  // Set inFunc back to false, indicating the visitor is outside a function
        return null;  // Return null, indicating the completion of the function call visit
    }

    //Visit function call operations
    public Integer visitFunctionCallOp(CCALParser.FunctionCallOpContext context){
        inFunc = true;
        st.enterScope();
        String id = context.ID().getText();
        String args = context.arg_list().getText();
        String[] arglist = args.split(".");
        if(arglist[0].isEmpty())
        arglist = new String[]{};
        if(!function.containsKey(id)) //check if the function exists
        throw new RuntimeErrorException(null, String.format("Error: Function %s is not defined", id));
        MyFunction func = (MyFunction)function.get(id);
        if (arglist.length != ((List<?>) func.params.accept(this)).size())
        throw new RuntimeErrorException(null, String.format("Error: %s call requires %d arguments but received %d", id, func.params.size(), arglist.length));
        for(int i = 0; i < arglist.length; i++){ //assign arguments to function parameters
            String argID = arglist[i];
            param param = func.params.get(i);
            int argvalue = memory.get(argID);
            String paramID = param.id;
            if(inFunc){
                paramID = "#" + paramID;
            }
            memory.put(paramID, argvalue);
            st.addSymbol(paramID, param.type, "local", "variable");
        }
        visit(func.declList);
        visit(func.block);
        int returnValue = visit(func.expr);
        List<String> IDList = st.exitScope();
        for(String localID:IDList){ //remove local variables from memory
            memory.remove(localID);
        }
        inFunc = false;
        return returnValue;
    }

    private boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;  // Successfully parsed as an integer
        } catch (NumberFormatException e) {
            return false;  // Not a valid integer
        }
    }

    //Remove fragments
    public Integer visitFragm(CCALParser.FragmContext context){
        String value = context.getText();
        if(isNumber(value)) //check if the value is a number
        return Integer.parseInt(value);
        if(value.equalsIgnoreCase("false")) //check if the value is a boolean
        return 0;
        boolean negative = false;
        if(value.charAt(0) == '-'){ //takes care of negative numbers
            negative = true;
            value = value.substring(1);
        }
        if(memory.containsKey(value) || memory.containsKey("#" + value)){ //check if the value is in memory
            int idvalue;
            if(inFunc)
            value = "#" + value;
            idvalue = memory.get(value);
            return(negative) ? -idvalue : idvalue; //return the value with the correct sign
        }
        throw new RuntimeErrorException(null, String.format("Error: %s is undefined", value)); //throw error if undefined
    }
    
}
