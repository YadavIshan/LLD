package SOLID.DIP.Example1.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("Alice");
    }
}
