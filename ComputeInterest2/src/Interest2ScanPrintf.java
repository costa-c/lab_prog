import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on $17,000 invested at an interest
 * rate of 0.027 for one year. The interest and
 * the value of the investment after one year are
 * printed to standard output.
 */

public class Interest2ScanPrintf {
    public static void main(String... args) {
        /* Declare the variables. */

        double principal; // The value of the investment.
        double rate; // The annual interest rate.
        double interest; // Interest earned in one year.

        Scanner stdin = new Scanner(System.in); // Create stdin for reading  

        System.out.print("Enter the initial investment: ");
        principal = stdin.nextDouble();
        System.out.print("Enter the annual interest rate (as a decimal): ");
        rate = stdin.nextDouble();

        /* Do the computations. */
        interest = principal * rate; // Compute the interest.
        principal += interest;
        /* Output the results. */
        System.out.printf("  The amount of interest is: %,20.2f Eur%n", 
                                                                    interest);
        System.out.format("The value after one year is: %,20.2f Eur%n", 
                                                                    principal);
    }
}
