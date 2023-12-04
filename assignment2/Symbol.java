// Class representing a symbol in the symbol table
public class Symbol {
    // Fields to store information about the symbol
    String id;    // Identifier name
    String type;  // Type of the symbol (e.g., integer, boolean)
    String scope; // Scope in which the symbol is declared
    String kind;  // Kind of symbol (e.g., variable, constant)

    // Constructor to initialize the symbol with provided values
    public Symbol(String id, String type, String scope, String kind) {
        this.id = id;
        this.type = type;
        this.scope = scope;
        this.kind = kind;
    }
}
