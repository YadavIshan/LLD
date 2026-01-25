package DP.Repository.BetterCode;

import java.util.List;

public class SqlUserRepository implements UserRepository {
    @Override
    public void save(String username) {
        // Implementation detail: SQL
        // This is the ONLY place that knows about SQL.
        System.out.println("SQL Repo: INSERT INTO users VALUES ('" + username + "')");
    }

    @Override
    public List<String> getUsers(int limit , int offset) {
        // Implementation detail: SQL
        // This is the ONLY place that knows about SQL.
        System.out.println("SQL Repo: SELECT * FROM users LIMIT " + limit + " OFFSET " + offset);
        return List.of("User1", "User2", "User3");
    }
}
