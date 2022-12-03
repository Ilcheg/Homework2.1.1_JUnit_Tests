package taxes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.taxes.VATaxType;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VATaxTypeTests {

    @BeforeEach
    public void setup() {
        System.out.println("Test started!");
    }

    @AfterEach
    public void teardown() {
        System.out.println("Test ended!");
    }

    @Test
    public void calculateTaxForTest() {
        double a = 2, expected = 0.36;
        final var vaTaxType = new VATaxType();

        final var result = vaTaxType.calculateTaxFor(a);

        assertEquals(expected, result);
    }

    @MethodSource("methodSource")
    @ParameterizedTest
    public void parameterizedcalculateTaxForTest(double a, double expected) {
        final var vaTaxType = new VATaxType();

        final var result = vaTaxType.calculateTaxFor(a);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> methodSource() {
        return Stream.of(Arguments.of(4, 0.72), Arguments.of(2, 0.36));
    }
}
