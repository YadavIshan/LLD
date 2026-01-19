package Principle.DRY.BetterCode;

public class StudentService {
    public void addStudent(String name, int age) {
        validateStudent(name, age);
        System.out.println("Student added: " + name);
    }

    public void updateStudentName(String oldName, String newName, int age) {
        validateStudent(newName, age);
        System.out.println("Student updated from " + oldName + " to " + newName);
    }

    // Extracted method to remove duplication
    private void validateStudent(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
    }
}
