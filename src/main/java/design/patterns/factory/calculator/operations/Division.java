package design.patterns.factory.calculator.operations;

import design.patterns.factory.calculator.MathOperation;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public record Division(double number) implements MathOperation {

    @Override
    public double performOperation(double result) {
        if (number == 0) {
            throw new ArithmeticException("Division by 0!");
        }
        return result / number;
    }
}