package SOLID.SRP.Example2.ProblematicCode;

public class UserManager {
    public void addUser(User user) {
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User must be at least 18 years old");
        }
        System.out.println("Adding user");
    }

    public void deleteUser(User user) {
        System.out.println("Deleting user");
    }

    public void updateUser(User user) {
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User must be at least 18 years old");
        }
        System.out.println("Updating user");
    }

    public void fetchUser(User user) {
        System.out.println("Fetching user");
    }

    // Currently UserManager class was focused on one Responsibility which was
    // managing user
    // But now we need to add new functionality to log user activity , which breaks
    // the single responsibility principle
    // So we need to separate this functionality into different classes

    public void logUserActivity(User user) {
        System.out.println("Logging user activity");
    }
}
