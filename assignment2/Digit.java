public class Digit {

    public static boolean isDigit(String strNum) {
        if (strNum == null) {
            return false;
        }

        try {
            // Attempt to parse the string as a double
            double d = Double.parseDouble(strNum);
            return true;  // If successful, return true
        } catch (NumberFormatException nfe) {
            // If an exception is caught, return false
            return false;
        }
    }
}
