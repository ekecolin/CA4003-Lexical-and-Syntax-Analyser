// https://stackoverflow.com/questions/24462351/testing-antlr4-visitor-rules
// https://www.javatips.net/api/resource-server-master/src/main/java/org/osiam/storage/query/EvalVisitor.java
// Class for Intermediate Representation (IR) visitor extending from CCALBaseVisitor
public class IrVisitor extends CCALBaseVisitor<String> {
    private OutputFile outFile;  // Output file object to write IR
    private int branch;  // Branch counter
    private boolean insBranch;  // Flag to check if inside a branch
    private String block;  // Stores the current block of code

    // Constructor initializes the output file, branch counter, insBranch flag, and block string
    public IrVisitor(String path){ // Create a new OutputFile object with the specified path
        this.outFile = new OutputFile(path);
        this.branch = 0;
        this.insBranch = false;
        this.block = "";
    }

    //method to visit main function
    public String visitMain(CCALParser.MainContext context){
        outFile.write("main:" + "\n");
        return super.visitMain(context);
    }

    // Processes assignment statements during the visit
    public String visitAssignmentStatement(CCALParser.AssignmentStatementContext context){
        String id = context.ID().getText();  // Extracts the identifier from the assignment statement
        String value = context.expression().getText();  // Retrieves the expression text from the assignment statement

        // Adds "0" to the value if it starts with a negative sign
        if(value.charAt(0) == '-'){
            value = "0" + value;
        }

        outFile.append(id + " = " + value + "\n");  // Appends the assignment statement to the output file
        return null;  // Indicates that this method does not produce a result
    }

    // Processes fragments during the visit and returns the text of the fragment
    public String visitFragm(CCALParser.FragmContext context){
        return context.getText();  // Returns the text of the fragment
    }

    // Handles constant declaration statements during the visit
    public String visitConst_decl(CCALParser.Const_declContext context){
        String id = context.ID().getText();  // Extracts the identifier from the constant declaration
        String value = context.expression().getText();  // Retrieves the expression text from the constant declaration

        // Adds "0" to the value if it starts with a negative sign
        if(value.charAt(0) == '-'){
            value = "0" + value;
        }

        outFile.append(id + "=" + value + "\n");  // Appends the constant declaration statement to the output file
        return null;  // Indicates that this method does not produce a result
    }

        // Processes while statements during the visit
    public String visitWhileStatement(CCALParser.WhileStatementContext context){
        this.insBranch = true;  // Indicates that branch labels should be generated
        branch++;  // Increments the branch counter
        String condition = visit(context.condition());  // Visits the condition of the while statement
        visit(context.statement_block());  // Visits the block of statements inside the while loop
        String blocklabel = "Label" + branch;  // Generates a label for the block
        branch++;  // Increments the branch counter
        String condlabel = "Label" + branch;  // Generates a label for the condition
        // Appends intermediate representation (IR) for the while loop to the output file
        outFile.append(String.format("%s:\n%sgoto %s\n", blocklabel, this.block, condlabel));
        outFile.append("goto" + condlabel + "\n");
        this.block = "";  // Resets the block string
        this.insBranch = false;  // Resets the inside branch flag
        return null;  // Indicates that this method does not produce a result
    }

    // Processes if-else statements during the visit
    public String visitIfElseStatement(CCALParser.IFElseStatementContext context){
        this.insBranch = true;  // Indicates that branch labels should be generated
        this.branch++;  // Increments the branch counter
        String condition = visit(context.condition());  // Visits the condition of the if statement
        visit(context.statement_block(0));  // Visits the block of statements inside the if block
        String label = "Label" + branch;  // Generates a label for the if block
        // Appends intermediate representation (IR) for the if block to the output file
        outFile.append(String.format("%s:\n%sreturn\n", label, this.block));
        outFile.append(String.format("if %s goto %s\n", condition, label));
        this.block = "";  // Resets the block string
        // Processes the else block if it exists
        if(context.statement_block(1) != null){
            this.branch++;  // Increments the branch counter
            label = "Label" + branch;  // Generates a label for the else block
            visit(context.statement_block(1));  // Visits the block of statements inside the else block
            // Appends intermediate representation (IR) for the else block to the output file
            outFile.append(String.format("%s:\n%sreturn\n", label, this.block));
            outFile.append(String.format("if %s goto %s\n", condition, label));
            this.block = "";  // Resets the block string
        }
        this.insBranch = false;  // Resets the inside branch flag
        return null;  // Indicates that this method does not produce a result
    }
}