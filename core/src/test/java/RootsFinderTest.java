import org.example.QuadraticEquation;
import org.example.RootsFinder;
import org.example.Solution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@ExtendWith(MockitoExtension.class)
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

    @Mock
    QuadraticEquation equationMock;

    @Test
    void solve_ShouldCallGettersAndReturnSolution() {
        // Настраиваем мок
        when(equationMock.getA()).thenReturn(1.0);
        when(equationMock.getB()).thenReturn(-3.0);
        when(equationMock.getC()).thenReturn(2.0);

        RootsFinder solver = new RootsFinder();
        Solution solution = solver.solve(equationMock);


        verify(equationMock, times(1)).getA();
        verify(equationMock, times(1)).getB();
        verify(equationMock, times(1)).getC();

        // Проверяем результат
        assertEquals(2.0, solution.getX1());
        assertEquals(1.0, solution.getX2());
    }
}

