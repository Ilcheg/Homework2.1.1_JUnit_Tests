package taxes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.taxes.ProgressiveTaxType;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressiveTaxTypeTests {

    @BeforeEach
    public void setup() {
        System.out.println("Test started");
    }

    @AfterEach
    public void teardown() {
        System.out.println("Test ended");
    }

    @MethodSource("methodSource")
    @ParameterizedTest
    public void parameterizedcalculateTaxForTest(double a, double expected) {
        final var progressiveTaxType = new ProgressiveTaxType();
        final var result = progressiveTaxType.calculateTaxFor(a);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> methodSource() {
        return Stream.of(Arguments.of(20000, 2000), Arguments.of(105000, 15750));
    }
}
