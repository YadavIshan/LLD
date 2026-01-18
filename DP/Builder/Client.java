package DP.Builder;

public class Client {
    public static void main(String[] args) {
        User user1 = User.userBuilder()
                .firstName("Ishan")
                .lastName("Yadav")
                .age(30)
                .phone("1234567890")
                .address("123, Some Street, Some City")
                .build();

        System.out.println("User 1 First Name: " + user1.getFirstName());
        System.out.println("User 1 Last Name: " + user1.getLastName());
        System.out.println("User 1 Age: " + user1.getAge());
        System.out.println("User 1 Phone: " + user1.getPhone());
        System.out.println("User 1 Address: " + user1.getAddress());

        User user2 = User.userBuilder()
                .firstName("John")
                .lastName("Doe")
                .age(25)
                .build();

        System.out.println("User 2 First Name: " + user2.getFirstName());
        System.out.println("User 2 Last Name: " + user2.getLastName());
        System.out.println("User 2 Age: " + user2.getAge());
        System.out.println("User 2 Phone: " + user2.getPhone());
        System.out.println("User 2 Address: " + user2.getAddress());
    }
}
