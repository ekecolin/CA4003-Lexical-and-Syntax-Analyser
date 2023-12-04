import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This class handles write, append, and prepend operations to a file.
 * If the file does not exist, it will be created.
 */
public class OutputFile {
    private final String filePath;
    private final BufferedWriter writer;

    /**
     * Constructs an OutputFile object with the specified file path.
     *
     * @param path The path to the output file.
     */
    public OutputFile(String path) {
        this.filePath = path;
        try {
            // Create a BufferedWriter with the FileWriter in append mode
            this.writer = new BufferedWriter(new FileWriter(this.filePath, true));
        } catch (IOException e) {
            // If an error occurs during initialization, throw a RuntimeException
            throw new RuntimeException("Error initializing BufferedWriter", e);
        }
    }

    /**
     * Writes the given string to the file.
     *
     * @param str The string to write to the file.
     */
    public void write(String str) {
        try {
            this.writer.write(str);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    /**
     * Appends the given string to the end of the file.
     *
     * @param str The string to append to the file.
     */
    public void append(String str) {
        try {
            this.writer.append(str);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    /**
     * Prepends the given string to the beginning of the file.
     *
     * @param str The string to prepend to the file.
     */
    public void prepend(String str) {
        try {
            // Read the existing content of the file
            String content = Files.readString(Path.of(this.filePath));
            // Write the new string followed by the existing content
            this.writer.write(String.format("%s\n%s", str, content));
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    /**
     * Closes the BufferedWriter to release resources.
     */
    public void close() {
        try {
            this.writer.close();
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    /**
     * Helper method to handle IOException by printing the error and stack trace.
     *
     * @param e The IOException to handle.
     */
    private void handleIOException(IOException e) {
        System.out.println(e);
        e.printStackTrace(System.out);
    }
}
