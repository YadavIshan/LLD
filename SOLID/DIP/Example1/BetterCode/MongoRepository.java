package SOLID.DIP.Example1.BetterCode;

public class MongoRepository implements IRepository {
    @Override
    public void save(String data) {
        System.out.println("Saving " + data + " to Mongo Database...");
    }
}
