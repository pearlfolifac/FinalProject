package org.pearl;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private Department department;
    private List<Assignment> assignments = new ArrayList<>();
    private List<Student> registeredStudents = new ArrayList<>();

    public Course(String courseId, String courseName, int credits, Department department) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
    }

    public double calcStudentAvg(Student student) {
        return registeredStudents.contains(student) ?
                assignments.stream().mapToDouble(Assignment::calcAssignmentAvg).average().orElse(0) : 0;
    }

    public String toSimplifiedString() {
        return courseId + ": " + courseName + ", " + credits + " credits, " + department;
    }

    @Override
    public String toString() {
        return courseId + ": " + courseName + ", " + credits + " credits, " + department + ", Assignments: " + assignments + ", Registered Students: " + registeredStudents;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return courseId.equals(course.courseId) &&
                courseName.equals(course.courseName) &&
                credits == course.credits &&
                department.equals(course.department);
    }

}
