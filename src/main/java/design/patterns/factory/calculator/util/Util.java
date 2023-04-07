package design.patterns.factory.calculator.util;

import design.patterns.factory.calculator.MathOperation;
import design.patterns.factory.calculator.OperationType;
import design.patterns.factory.calculator.operations.*;

import java.text.DecimalFormat;
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

    public static String getFormattedNumber(double number) {
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(number);
    }

    public static String buildEquation(List<MathOperation> operations, double initialValue) {
        StringBuilder sb = new StringBuilder();
        sb.append(getFormattedNumber(initialValue));
        for (MathOperation operation : operations) {
            double number = operation.getNumber();
            if (operation instanceof Addition) {
                sb.append(" + ")
                        .append(getFormattedNumber(number));
            }
            if (operation instanceof Subtraction) {
                sb.append(" - ")
                        .append(getFormattedNumber(number));
            }
            if (operation instanceof Division) {
                sb.append(" / ")
                        .append(getFormattedNumber(number));
            }
            if (operation instanceof Multiplication) {
                sb.append(" + ")
                        .append(getFormattedNumber(number));
            }
        }
        return sb.toString();
    }
}
