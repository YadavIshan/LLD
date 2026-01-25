package DP.Repository.BetterCode;

public class Main {
    public static void main(String[] args) {
        UserRepository sqlRepo = new SqlUserRepository();

        // Client just specifies the batch size (limit)
        // Offset management is completely hidden!
        Iterator<List<String>> iterator = new UserIterator(sqlRepo, 10);

        while (iterator.hasNext()) {
            System.out.println("Fetching next page...");
            List<String> users = iterator.next();
            System.out.println("Processing " + users.size() + " users: " + users);
        }
    }
}
