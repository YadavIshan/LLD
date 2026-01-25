
package DP.Iterator;

import java.util.List;

import DP.Builder.User;
import DP.Repository.BetterCode.UserRepository;

public class UserIterator implements Iterator<User>{

    private UserRepository userRepository;
    private int limit = 1 ;
    private int offset = 0 ;
    private List<String> current;
    
    public UserIterator(UserRepository userRepository , int limit) {
        this.userRepository = userRepository;
        this.current = userRepository.getUsers(limit , offset);
    }

    @Override
    public Boolean hasNext() {
        return !current.isEmpty();
    }

    @Override
    public User next() {
        List<String> next = current;
        offset += limit;
        current = userRepository.getUsers(limit , offset);
        return next;
    }
}