package root;

public class Rooter {
    // The precision for the square root calculation
    private double precision;

    // Constructor to initialize the Rooter with a specified precision
    public Rooter(double precision) {
        setPrecision(precision);
    }

    // Method to set the precision for the square root calculation
    public void setPrecision(double precision) {
        this.precision = precision;
    }

    // Method to calculate the square root of a given number using the Babylonian method
    public double sqrt(double x) {
        double one = 1, two = x;
        // Loop until the difference between 'one' and 'two' is less than the precision
        while (one != two) {
            one = (one + two) / 2;
            two = x / one;
            // If the absolute difference between 'one' and 'two' is less than the precision, break the loop
            if (Math.abs(one - two) < precision)
                break;
        }
        return one;
    }
}
