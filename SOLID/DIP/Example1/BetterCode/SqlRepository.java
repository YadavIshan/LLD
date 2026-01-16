package SOLID.DIP.Example1.BetterCode;

public class SqlRepository implements IRepository {
    @Override
    public void save(String data) {
        System.out.println("Saving " + data + " to SQL Database...");
    }
}
