package DP.Repository.BetterCode;

public class SqlUserRepository implements UserRepository {
    @Override
    public void save(String username) {
        // Implementation detail: SQL
        // This is the ONLY place that knows about SQL.
        System.out.println("SQL Repo: INSERT INTO users VALUES ('" + username + "')");
    }
}
