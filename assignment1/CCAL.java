import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.FileInputStream;
import java.io.InputStream;

public class CCAL {

    public static void main(String[] args) throws Exception {

        // Get the input file name from the command line arguments
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];

        // Create an input stream from the input file (or stdin if no file provided)
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        } else {
            System.err.println("No input file provided. Try again with an input file");
            return;
        }

        // Create a lexer and parser for the input file
        CCALLexer lexer = new CCALLexer(CharStreams.fromStream(is));
        // Remove the default error listeners
        lexer.removeErrorListeners();
        // Add our custom error listener
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create a parser for the tokens
        CCALParser parser = new CCALParser(tokens);
        // Remove the default error listeners
        parser.removeErrorListeners();

        // Attempt to parse the input
        ParseTree tree = parser.prog();

        // If there are any syntax errors, print the error messages and exit
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println(inputFile + " has not parsed successfully.");
        } else {
            System.err.println(inputFile + " parsed successfully.");

            return;
        }

    }

}