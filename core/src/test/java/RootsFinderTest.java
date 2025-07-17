import org.example.QuadraticEquation;
import org.example.RootsFinder;
import org.example.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RootsFinderTest {
    @Test
    void shouldSolveEquation() {
        QuadraticEquation eq = new QuadraticEquation(1, 2, 1);
        Solution solution = new RootsFinder().solve(eq);
        assertEquals(-1, solution.getX1(), 0.001);
    }
    @Test
    void shouldSolveEquation2() {
        QuadraticEquation eq = new QuadraticEquation(1, 2, 1);
        Solution solution = new RootsFinder().solve(eq);
        assertEquals(-1, solution.getX1(), 0.001);
    }
}
