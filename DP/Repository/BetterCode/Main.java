package DP.Repository.BetterCode;
import java.util.List;

import DP.Iterator.UserIterator;

public class Main {
    public static void main(String[] args) {
        UserRepository sqlRepo = new SqlUserRepository();

        // Client just specifies the batch size (limit)
        // Offset management is completely hidden!
        UserIterator iterator = new UserIterator(sqlRepo, 10);

        while (iterator.hasNext()) {
            System.out.println("Fetching next page...");
            String user = iterator.next();
            System.out.println("Processing " + user);
        }
    }
}
