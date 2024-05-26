package org.pearl;

public class Student {
    private String studentId;
    private String studentName;
    private Address address;
    private Gender gender;
    private static int nextId = 1;

    public Student(String studentName, Address address, Gender gender) {
        this.studentId = "S" + String.format("%02d", nextId++);
        this.studentName = studentName;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return studentId + ": " + studentName + ", " + gender + ", " + address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId.equals(student.studentId) &&
                studentName.equals(student.studentName) &&
                address.equals(student.address) &&
                gender == student.gender;
    }

}
