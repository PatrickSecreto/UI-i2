package numeth_backend;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class EvaluateFunction {

    private static final DoubleEvaluator EVALUATOR = new DoubleEvaluator();

    public static double evaluate(String equation, double x) {
        // Check if the equation is null
        if (equation == null) {
            throw new IllegalArgumentException("Equation cannot be null");
        }
        
        // Replace 'x' in the equation with the given value
        String equationWithX = equation.replace("x", String.valueOf(x));

        // Evaluate the modified equation using Javaluator
        return EVALUATOR.evaluate(equationWithX);
    }
}
