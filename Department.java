package org.pearl;

public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId = 1;

    public Department(String departmentName) {
        if (validateDepartmentName(departmentName)) {
            this.departmentId = "D" + String.format("%02d", nextId++);
            this.departmentName = departmentName;
        } else {
            this.departmentId = null;
            this.departmentName = null;
        }
    }

    public static boolean validateDepartmentName(String departmentName) {
        return departmentName != null && departmentName.matches("[A-Za-z ]+");
    }

    @Override
    public String toString() {
        return departmentId + ": " + departmentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department department = (Department) obj;
        return departmentId.equals(department.departmentId) &&
                departmentName.equals(department.departmentName);
    }

}
