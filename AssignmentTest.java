package org.pearl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {

    @Test
    public void testCalcAssignmentAvg() {
        Assignment assignment = new Assignment();
        double average = assignment.calcAssignmentAvg();
        assertTrue(average >= 0 && average <= 100);
    }

    @Test
    public void testIsAssignmentsTotalWeightValid() {
        assertTrue(Assignment.isAssignmentsTotalWeightValid(100));
        assertFalse(Assignment.isAssignmentsTotalWeightValid(90));
    }

    @Test
    public void testAssignmentToString() {
        Assignment assignment = new Assignment();
        assertNotNull(assignment.toString());
    }

    @Test
    public void testAssignmentEquals() {
        Assignment assignment1 = new Assignment();
        Assignment assignment2 = new Assignment();
        assertNotEquals(assignment1, assignment2);
        assertEquals(assignment1, assignment1);
    }
}
