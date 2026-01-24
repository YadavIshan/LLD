package DP.Repository.BetterCode;

public class UserService {
    private UserRepository userRepository;

    // Dependency Injection: We don't say 'new SqlUserRepository()' here.
    // We just ask for ANY UserRepository.
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String username) {
        // Business logic: Validation, hashing, etc.
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Invalid username");
        }

        // Data Access: Delegated to the repository
        userRepository.save(username);

        System.out.println("User registered via Repository");
    }
}
