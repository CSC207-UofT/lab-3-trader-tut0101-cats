/**
 * Tests for the class Cow.
 */

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }

    @Test
    public void testSound() {
        assertEquals("Moo.", c.sound());
    }

    @Test
    public void testGetPrice() {
        assertEquals(20, c.getPrice());
    }
}
