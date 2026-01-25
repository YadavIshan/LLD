package DP.Repository.BetterCode;

import java.util.List;

public interface UserRepository {
    void save(String username);
    List<String> getUsers(int limit , int offset);
}
