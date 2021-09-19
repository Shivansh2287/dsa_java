package searchingSorting;

public class middileofthree {
    public static int middleOfThree(int a, int b, int c) {
        // x is positive if a is greater than b.
        // x is negative if b is greater than a.
        int x = a - b;

        int y = b - c; // Similar to x
        int z = a - c; // Similar to x and y.

        // Checking if b is middle (x and y
        // both are positive)
        if (x * y > 0)
            return b;

        // Checking if c is middle (x and z
        // both are positive)
        else if (x * z > 0)
            return c;
        else
            return a;
    }

    // driver code
    public static void main(String[] args) {
        int a = 20, b = 30, c = 40;
        System.out.println(middleOfThree(a, b, c));
    }
}
