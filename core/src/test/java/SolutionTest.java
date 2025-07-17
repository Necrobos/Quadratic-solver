import org.example.QuadraticEquation;
import org.example.Solution;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionWithTwoRoots_ShouldStoreCorrectValues() {

        double x1 = 2.0;
        double x2 = -1.5;

        Solution solution = new Solution(x1, x2);

        assertEquals(x1, solution.getX1());
        assertEquals(x2, solution.getX2());
        assertTrue(solution.getRealNumFlag());
    }

    @Test
    void solutionWithNoRoots_ShouldStoreNullValues() {

        Solution solution = new Solution();

        assertNull(solution.getX1());
        assertNull(solution.getX2());
        assertFalse(solution.getRealNumFlag());
    }
    @Test
    void print_ShouldShowTwoRoots_WhenTwoRoots() {

        Solution solution = new Solution(2.0, 1.0);
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2); // x² -3x +2 = 0
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        solution.print(equation);

        String output = outContent.toString();
        assertTrue(output.contains("Уравнение имеет два корня: x1 = 2,00, x2 = 1,00"));
    }

    @Test
    void print_ShouldShowSingleRoot_WhenOneRoot() {

        Solution solution = new Solution(2.0);
        QuadraticEquation equation = new QuadraticEquation(1, -4, 4); // x² -4x +4 = 0
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        solution.print(equation);

        assertTrue(outContent.toString().contains("Уравнение имеет один корень: x = 2,00"));
    }

    @Test
    void print_ShouldShowNoRootsMessage_WhenNoRealRoots() {

        Solution solution = new Solution();
        QuadraticEquation equation = new QuadraticEquation(1, 0, 1); // x² + 1 = 0
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        solution.print(equation);

        assertTrue(outContent.toString().contains("Уравнение не имеет действительных корней"));
    }
}