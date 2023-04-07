package design.patterns.factory.calculator.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    FileReader fileReader;


    @BeforeEach
    void setUp() {
        fileReader = new FileReader();
    }

    @Test
    void testEmptyFile() throws FileNotFoundException {
        assertThrows(IllegalStateException.class, () -> fileReader.readFile("src/main/resources/factory/equation-Empty.txt"));
    }

    @Test
    void testNoApplyWordInFile() throws FileNotFoundException {
        assertThrows(IllegalArgumentException.class, () -> fileReader.readFile("src/main/resources/factory//equation-noApply.txt"));
    }

    @Test
    void testUnsupportedOperation() throws FileNotFoundException {
        assertThrows(IllegalArgumentException.class, () -> fileReader.readFile("src/main/resources/factory/equation-wrongOperation.txt"));
    }

    @Test
    void testUnsupportedNumber() throws FileNotFoundException {
        assertThrows(IllegalArgumentException.class, () -> fileReader.readFile("src/main/resources/factory/equation-wrongNumber.txt"));
    }

    @Test
    void testDivisionByZero() throws FileNotFoundException {
        assertThrows(IllegalArgumentException.class, () -> fileReader.readFile("src/main/resources/factory/equation-divisionByZero.txt"));
    }


}