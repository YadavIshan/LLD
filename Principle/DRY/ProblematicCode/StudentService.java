package Principle.DRY.ProblematicCode;

public class StudentService {
    public void addStudent(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
        System.out.println("Student added: " + name);
    }

    public void updateStudentName(String oldName, String newName, int age) {
        // DUPLICATION: Same validation logic repeated
        if (newName == null || newName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
        System.out.println("Student updated from " + oldName + " to " + newName);
    }
}
