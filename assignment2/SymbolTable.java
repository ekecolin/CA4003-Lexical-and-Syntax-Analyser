import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SymbolTable {
    // Symbol Table represented as a map
    public Map<String, Symbol> ST = new HashMap<>();
    // Stack to manage scope
    public Stack<String> stack = new Stack<>();

    // Method to signal entering a local scope by pushing a special marker to the stack
    public void enterScope() {
        stack.push("#");
    }

    // Method to exit a local scope and remove local declarations
    public List<String> exitScope() {
        List<String> idList = new ArrayList<>();
        while (stack.size() > 0) {
            String id = stack.pop();
            if (id.equals("#")) {
                break;
            }
            ST.remove(id);
            idList.add(id);
        }
        return idList;
    }

    // Method to add a symbol to the symbol table and push it to the stack
    public void addSymbol(String id, String type, String scope, String kind) {
        type = type.toLowerCase();
        Symbol symbol = new Symbol(id, type, scope, kind);
        ST.put(id, symbol);
        stack.push(id);
    }

    // Method to get a symbol from the symbol table with an id key
    public Symbol getSymbol(String id) {
        return ST.get(id);
    }

    // Method to get the type of a symbol
    public String getType(String id) {
        return getSymbol(id).type;
    }

    // Method to compare an identifier's type to a specified type
    public boolean compareType(String id, String type) {
        Symbol symbol = getSymbol(id);
        return type.equalsIgnoreCase(symbol.type);
    }

    // Method to check if a constant can be updated
    public boolean checkConstError(String id) {
        Symbol symbol = getSymbol(id);
        boolean isConst = "constant".equals(symbol.kind);
        if (!isConst) {
            return true;
        }
        throw new RuntimeException("Error: Unable to update constant " + id + " after declaration; consider using a variable instead.");

    }

    // Method to compare the type of a declaration to the type of a value being assigned
    public boolean compareTypeValue(String type, String value) throws RuntimeException {
        boolean typesMatch = false;
        // Check if the value is an identifier
        if (getSymbol(value) != null) {
            typesMatch = type.equalsIgnoreCase(getSymbol(value).type);
        }
        // Check if the value is a boolean
        else if (("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) && "boolean".equalsIgnoreCase(type)) {
            typesMatch = true;
        }
        // Check if the value is a number (integer)
        else if (value != null && "integer".equalsIgnoreCase(type)) {
            typesMatch = true;
        }
        if (typesMatch) {
            return true;
        }
        // Non-matching types
        throw new RuntimeException("Error: The type of the constant and the type of its assigned value do not match. Please correct and try again.");

    }
}
