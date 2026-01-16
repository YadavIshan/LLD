package SOLID.DIP.Example1.BetterCode;

public class Main {
    public static void main(String[] args) {
        // 1. Using SQL Repository
        IRepository sqlRepo = new SqlRepository();
        UserService userWithSql = new UserService(sqlRepo);
        userWithSql.registerUser("Bob");

        // 2. Switching to Mongo Repository WITHOUT changing UserService code
        IRepository mongoRepo = new MongoRepository();
        UserService userWithMongo = new UserService(mongoRepo);
        userWithMongo.registerUser("Charlie");
    }
}
