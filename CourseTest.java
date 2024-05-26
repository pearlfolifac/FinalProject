package org.pearl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class CourseTest {

    @Test
    public void testCalcStudentAvg() {
        Department department = new Department("Computer Science");
        Course course = new Course("CSE101", "Introduction to Programming", 3, department);
        Address address = new Address(123, "Main St", "City", "Province", "A1B2C3", "Country");
        Student student = new Student("John Doe", address, Gender.MALE);
        List<Assignment> assignments = new ArrayList<>();
        assignments.add(new Assignment());
        course.getRegisteredStudents().add(student);
        double average = course.calcStudentAvg(student);
        assertTrue(average >= 0 && average <= 100);
    }

    @Test
    public void testCourseToSimplifiedString() {
        Department department = new Department("Computer Science");
        Course course = new Course("CSE101", "Introduction to Programming", 3, department);
        assertNotNull(course.toSimplifiedString());
    }

    @Test
    public void testCourseToString() {
        Department department = new Department("Computer Science");
        Course course = new Course("CSE101", "Introduction to Programming", 3, department);
        assertNotNull(course.toString());
    }

    @Test
    public void testCourseEquals() {
        Department department = new Department("Computer Science");
        Course course1 = new Course("CSE101", "Introduction to Programming", 3, department);
        Course course2 = new Course("CSE102", "Data Structures", 3, department);
        assertNotEquals(course1, course2);
        assertEquals(course1, course1);
    }
}
