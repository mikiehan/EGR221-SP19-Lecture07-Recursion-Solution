package printbinary;

public class PrintBinary {

    // Prints the given integer's binary representation.
    // Finished Version (without any precondition)
    public static void printBinary(int n) {
        if (n < 0) {
            // recursive case for negative numbers
            System.out.print("-");
            printBinary(-n);
        } else if (n < 2) {
            // base case; same as base 10
            System.out.println(n);
        } else {
            // recursive case; break number apart
            printBinary(n / 2);
            printBinary(n % 2);
        }
    }

    // Prints the given integer's binary representation.
    // Precondition: n >= 0
    public static void printBinaryWithPrecondition(int n) {
        if (n < 2) {
            // base case; same as base 10
            System.out.println(n);
        } else {
            // recursive case; break number apart
            printBinaryWithPrecondition(n / 2);
            printBinaryWithPrecondition(n % 2);
        }
    }

}
