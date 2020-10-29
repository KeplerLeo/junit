package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
* class CalculatorTest.
*/
public class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test

    public void sum() {
        assertEquals(2, calc.add(1, 1));
    }
}
