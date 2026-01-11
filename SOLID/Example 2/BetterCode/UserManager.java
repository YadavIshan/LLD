package SOLID.Example2.ProblematicCode;

import SOLID.Example.User;

public class UserManager {
    public void addUser(User user) {
        if(user.getAge() < 18) {
            throw new IllegalArgumentException("User must be at least 18 years old");
        }
        System.out.println("Adding user");
    }
    public void deleteUser(User user) {
        System.out.println("Deleting user");
    }

    public void updateUser(User user) {
        if(user.getAge() < 18) {
            throw new IllegalArgumentException("User must be at least 18 years old");
        }
        System.out.println("Updating user");
    }

    public void fetchUser(User user) {
        System.out.println("Fetching user");
    }
}
