package pow;

public class Power {
    // Returns base ^ exponent.
    // Precondition: exponent >= 0
    // No optimization
    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            // base case; any number to 0th power is 1
            return 1;
        } else {
            // recursive case:  x^y = x * x^(y-1)
            return base * pow(base, exponent - 1);
        }
    }

    // Returns base ^ exponent.
    // Precondition: exponent >= 0
    // Implements optimization when exponent is even number
    public static int pow2(int base, int exponent) {
        if (exponent == 0) {
            // base case; any number to 0th power is 1
            return 1;
        } else if (exponent % 2 == 0) {
            // recursive case 1:  x^y = (x^2)^(y/2)
            return pow2(base * base, exponent / 2);
        } else {
            // recursive case 2:  x^y = x * x^(y-1)
            return base * pow2(base, exponent - 1);
        }
    }

}
