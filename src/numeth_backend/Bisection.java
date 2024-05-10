package numeth_backend;

/**
 *
 * @author eurek
 * OK NA HEHE
 * 
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Bisection {
    public static double globalXM;
    public static ObservableList<BracketingResult> bisectionMethod(String equation, double xl, double xu, double Ea_percentage) {
        ObservableList<BracketingResult> results = FXCollections.observableArrayList();
        
        double root = 0;
        int iteration = 1;
        double previousXm = 0; // Store the value of xm from the previous iteration

        do {
            // Calculate midpoint for bisection
            double xm = (xl + xu) / 2;

            // Evaluate the function at xl, xu, and xm
            double fxl = Bracketing.evaluateFunction(xl);
            double fxu = Bracketing.evaluateFunction(xu);
            double fxm = Bracketing.evaluateFunction(xm);

            // Calculate approximate relative error
            double approximateError;
            if (iteration > 1) {
                approximateError = Math.abs((xm - previousXm) / xm) * 100;
            } else {
                approximateError = Double.POSITIVE_INFINITY; // Set to infinity for the first iteration to avoid errors
            }

            // Print iteration info; not needed for frame. Just to see if tama sya
            System.out.printf("%-12d%-8.4f%-8.4f%-8.4f%-10.4f%-10.4f%-10.4f%-10.4f%n", iteration, xl, xm, xu, fxl, fxm, fxu, approximateError);
            System.out.println("Ea percentage: " + String.valueOf(Ea_percentage));

            // Add the current iteration result to the list
            results.add(new BracketingResult(
                    String.valueOf(iteration),
                    String.valueOf(xl),
                    String.valueOf(xm),
                    String.valueOf(xu),
                    String.valueOf(fxl),
                    String.valueOf(fxm),
                    String.valueOf(fxu),
                    String.valueOf(approximateError))
            );

            // Check if the approximate relative error is less than the desired error
            if (approximateError < Ea_percentage) {
                root = xm; // Update root if the error condition is met
                break;
            }

            // Determine which interval has a sign change
            if (fxl * fxm < 0) {
                xu = xm; // Update upper bound if sign change is between xl and xm
            } else {
                xl = xm; // Update lower bound if sign change is between xm and xu
            }

            // Update previousXm for the next iteration
            previousXm = xm;
            globalXM = xm;

            iteration++;
        } while (true);

        return results;
    }
}
