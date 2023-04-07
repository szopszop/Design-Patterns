package design.patterns.factory.calculator.util;

import design.patterns.factory.calculator.MathOperation;
import design.patterns.factory.calculator.MathOperationFactory;
import design.patterns.factory.calculator.OperationType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public List<MathOperation> readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);
        MathOperationFactory factory = new MathOperationFactory();
        List<MathOperation> operations = new LinkedList<>();

        while (scanner.hasNextLine()) {
            String equation = scanner.nextLine();

            OperationType operationType = Util.getOperationType(equation);
            Double number = Util.getNumber(equation);
            MathOperation operation = factory.calculate(operationType, number);
            operations.add(operation);

        }
        return operations;
    }
}
