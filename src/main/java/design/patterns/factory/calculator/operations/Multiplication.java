package design.patterns.factory.calculator.operations;

import design.patterns.factory.calculator.MathOperation;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public record Multiplication(double number) implements MathOperation {

    @Override
    public double performOperation(double result) {
        return result * number;
    }
}
