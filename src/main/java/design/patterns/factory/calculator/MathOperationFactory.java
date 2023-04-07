package design.patterns.factory.calculator;

import design.patterns.factory.calculator.operations.*;

public class MathOperationFactory {

    public MathOperation calculate(OperationType operationType, double number) {
        switch (operationType) {
            case ADD:
                return new Addition(number);
            case DIVIDE:
                return new Division(number);
            case MULTIPLY:
                return new Multiplication(number);
            case SUBTRACT:
                return new Subtraction(number);
            case APPLY:
                return new Base(number);
            default:
                throw new IllegalStateException("Wrong format");
        }
    }
}
