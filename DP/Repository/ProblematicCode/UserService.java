package DP.Repository.ProblematicCode;

public class UserService {
    public void registerUser(String username) {
        // VIOLATION: Service layer knows too much about Data Layer (SQL)
        // Hard to test because you can't mock this easily without a real DB.
        String sql = "INSERT INTO users (name) VALUES ('" + username + "')";
        System.out.println("Executing SQL: " + sql);

        System.out.println("User registered successfully");
    }
}
