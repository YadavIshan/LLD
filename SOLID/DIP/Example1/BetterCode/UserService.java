package SOLID.DIP.Example1.BetterCode;

public class UserService {
    // SOLUTION: High-level module depends on Abstraction (Interface)
    private IRepository repository;

    // Helper: Dependency Injection via Constructor
    public UserService(IRepository repository) {
        this.repository = repository;
    }

    public void registerUser(String username) {
        repository.save(username);
    }
}
