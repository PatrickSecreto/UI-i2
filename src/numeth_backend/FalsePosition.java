/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeth_backend;

/**
 *
 * @author eurek
 * OKI NA
 * 
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FalsePosition {
    public static double globalXM;
    public static ObservableList<BracketingResult> falseposMethod(String equation, double xl, double xu, double Ea_percentage) {
        ObservableList<BracketingResult> results = FXCollections.observableArrayList();
        double xm;

        // Retrieve the values from the BracketingInput method
        int iteration = 1;
        double previousXm = 0; // Store the value of xm from the previous iteration

        do {
            // Evaluate the function at xl, xu. Call values from EvaluateFunctionfile
            double fxl = Bracketing.evaluateFunction(xl);
            double fxu = Bracketing.evaluateFunction(xu);

            // Calculate midpoint for False Position
            xm = xu - (((fxu) * (xl - xu)) / (fxl - fxu));

            // Evaluate the function at xm; calling Bracketing which calls for evaluate function 
            double fxm = Bracketing.evaluateFunction(xm);

            // Calculate approximate relative error
            double approximateError;
            if (iteration > 1) {
                approximateError = Math.abs((xm - previousXm) / xm) * 100;
            } else {
                approximateError = Double.POSITIVE_INFINITY; // Set to infinity for the first iteration to avoid errors/issues
            }

            // Print iteration info; para icheck if tama sya baka di need sa jframe
            System.out.printf("%-12d%-8.4f%-8.4f%-8.4f%-10.4f%-10.4f%-10.4f%-10.4f%n", iteration, xl, xm, xu, fxl, fxm, fxu, approximateError);

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
            
            iteration++;
        } while (true);

        return results;
    }
}

