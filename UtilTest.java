package org.pearl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilTest {

    @Test
    public void testToTitleCase() {
        String input = "john doe";
        String expected = "John Doe";
        String result = Util.toTitleCase(input);
        assertEquals(expected, result);

        input = "computer science";
        expected = "Computer Science";
        result = Util.toTitleCase(input);
        assertEquals(expected, result);
    }
}
