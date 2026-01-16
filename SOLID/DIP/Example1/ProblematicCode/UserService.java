package SOLID.DIP.Example1.ProblematicCode;

public class UserService {
    // VIOLATION: High-level module (UserService) depends on Low-level module
    // (SqlRepository) directly.
    // We cannot switch to MongoRepository without changing this code.
    private SqlRepository repository;

    public UserService() {
        this.repository = new SqlRepository(); // Hard dependency
    }

    public void registerUser(String username) {
        repository.save(username);
    }
}
