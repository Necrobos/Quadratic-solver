import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuadraticEquationTest {
    @Test
    void shouldThrowExceptionWhenZeroA() {
        assertThrows(IllegalArgumentException.class, () -> {
            new QuadraticEquation(0, 2, 3);
        });
    }
}
