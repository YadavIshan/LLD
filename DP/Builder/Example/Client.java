package DP.Builder.Example;

public class Client {
    public static void main(String[] args) {
        User user = new User.Builder()
                .firstName("Alice")
                .lastName("Smith")
                .age(28)
                .phone("555-0199")
                .address("456 Example Lane")
                .build();

        System.out.println("Example User Created:");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Address: " + user.getAddress());
    }
}
