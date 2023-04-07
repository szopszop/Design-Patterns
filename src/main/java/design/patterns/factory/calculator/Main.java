package design.patterns.factory.calculator;

import design.patterns.factory.calculator.util.FileReader;
import design.patterns.factory.calculator.util.Util;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        double result;

        try {
            List<MathOperation> operations = fileReader.readFile("src/main/resources/factory/equation.txt");
            double initialValue = Util.getInitialValue(operations);
            result = initialValue;
            for (MathOperation operation : operations) {
                result = operation.performOperation(result);
            }
            String equation = Util.buildEquation(operations, initialValue);
            System.out.println(equation + " = " + Util.getFormattedNumber(result));

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(-1);
        } catch (Exception e) {
            System.out.println("Unable to calculate:\n" + e.getMessage());
            System.exit(-1);
        }
    }
}
