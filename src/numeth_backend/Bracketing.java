package numeth_backend;

public class Bracketing {

    public static double xl, xu, Ea_percentage;
    public static String equation;
    
    public static double evaluateFunction(double x) {
        // Check if equation is null before calling evaluate function
        if (equation == null) {
            throw new IllegalArgumentException("Equation cannot be null");
        }
        // Call evaluate function from EvaluateFunction class
        return EvaluateFunction.evaluate(equation, x);
    }
}