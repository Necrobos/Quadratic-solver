package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileInputTest {
    @Test
    void testInvalidFileContent() throws Exception {
        // Создаем временный файл напрямую
        File testFile = new File("test_input.txt");
        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("1.0\nnot_a_number\n3.0");
        }
            assertThrows(Exception.class, () -> {
                FileInput.readCoefficients(testFile.getAbsolutePath());
            });
    }

}