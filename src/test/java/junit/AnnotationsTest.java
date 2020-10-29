package junit;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * AnnotationsTest.
 */
public class AnnotationsTest {

    /** Logger. **/
    private static Logger logger = Logger.getLogger("AnnotationsTest");

    private static List<String> cars;

    @BeforeAll
    public static void init() {
        logger.info("init");
        cars = new ArrayList<String>();
        cars.add("Volvo");
    }

    @BeforeEach
    public void add() {
        logger.info("add");
        cars.add("Bmw");
    }

    @Test
    @DisplayName("Length test")
    public void length() {
        logger.info("length");
        assertEquals(2, cars.size());
    }

    @Test
    @DisplayName("Remove car test")
    public void remove() {
        logger.log(Level.INFO, "remove");
        cars.remove(0);
        assertEquals(2, cars.size());
    }
}
