package design.patterns.factory.calculator.util;

import design.patterns.factory.calculator.MathOperation;
import design.patterns.factory.calculator.OperationType;
import design.patterns.factory.calculator.operations.Base;

import java.util.List;

public class Util {

    public static OperationType getOperationType (String equation) {
        return OperationType.valueOf(equation.split(" ")[0].toUpperCase());
    }

    public static Double getNumber(String equation) {
        return Double.parseDouble(equation.split(" ")[1]);
    }

    public static double getInitialValue(List<MathOperation> operations) {
        MathOperation lastOperation = operations.get(operations.size() - 1);
        if (lastOperation instanceof Base base) {
            return base.getNumber();
        }
        return 0;
    }
}
