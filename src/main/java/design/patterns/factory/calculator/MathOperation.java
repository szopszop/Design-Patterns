package design.patterns.factory.calculator;

public interface MathOperation {

    double getNumber();
    double performOperation(double number);
}
