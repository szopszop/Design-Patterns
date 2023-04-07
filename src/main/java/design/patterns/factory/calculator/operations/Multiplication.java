package design.patterns.factory.calculator.operations;

import design.patterns.factory.calculator.MathOperation;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Multiplication implements MathOperation {

    private final double number;
    @Override
    public double performOperation(double result) {
        return result * number;
    }
}
