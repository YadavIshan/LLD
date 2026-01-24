package DP.Repository.BetterCode;

public class Main {
    public static void main(String[] args) {
        // 1. Create the specific data access implementation (SQL)
        UserRepository sqlRepo = new SqlUserRepository();

        // 2. Inject it into the Service
        UserService service = new UserService(sqlRepo);

        // 3. Use the service
        service.registerUser("ishan");
    }
}
