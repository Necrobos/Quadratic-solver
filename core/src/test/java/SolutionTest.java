import org.example.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionWithTwoRoots_ShouldStoreCorrectValues() {
        // Arrange
        double x1 = 2.0;
        double x2 = -1.5;

        // Act
        Solution solution = new Solution(x1, x2);

        // Assert
        assertEquals(x1, solution.getX1());
        assertEquals(x2, solution.getX2());
        assertTrue(solution.getRealNumFlag());
    }

    @Test
    void solutionWithNoRoots_ShouldStoreNullValues() {
        // Arrange & Act
        Solution solution = new Solution();

        // Assert
        assertNull(solution.getX1());
        assertNull(solution.getX2());
        assertFalse(solution.getRealNumFlag());
    }

//    @Test
//    void solutionWithTwoRoots_ShouldPrintCorrectMessage() {
//        // Arrange
//        Solution solution = new Solution(2.0, -1.5);
//        QuadraticEquation equation = new QuadraticEquation(1, -0.5, -3); // x² - 0.5x - 3 = 0
//
//        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//
//        String expectedOutput = "Уравнение имеет два корня: x1 = 2.00, x2 = -1.50";
//
//        // Act
//        solution.print(equation);
//
//        // Assert
//        assertTrue(outContent.toString().contains(expectedOutput));
//    }
}