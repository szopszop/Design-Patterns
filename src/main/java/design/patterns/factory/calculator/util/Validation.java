package design.patterns.factory.calculator.util;

import design.patterns.factory.calculator.OperationType;

import java.io.File;

public class Validation {

    public static void isFileEmpty(File file) {
        if (file.length() == 0) {
            throw new IllegalStateException("File is empty");
        }
    }

    public static void inputValidation(String equation) {
        if (!isFormatValid(equation)) {
            throw new IllegalArgumentException("Wrong format");
        }
        if (!isOperationValid(equation)) {
            throw new IllegalArgumentException("Wrong operation type");
        }
        if (!isNumberValid(equation)) {
            throw new IllegalArgumentException("Wrong number");
        }
    }

    static boolean isFormatValid(String equation) {
        return equation.split(" ").length == 2;
    }

    static boolean isOperationValid(String equation) {
        String operation = equation.split(" ")[0].toUpperCase();
        try {
            OperationType.valueOf(operation);
            return true;
        } catch (IllegalStateException e) {
            return false;
        }
    }

    static boolean isNumberValid(String equation) {
        String number = equation.split(" ")[1];
        return number.chars().allMatch(Character:: isDigit);
    }

    static boolean isWordApplyInLine(String equation) {
        String operation = equation.split(" ")[0].toUpperCase();
        return operation.equals(String.valueOf(OperationType.APPLY));
    }

    public static void noApplyWordException() {
        throw new IllegalStateException("Apply word has not been found in the file");
    }

}
