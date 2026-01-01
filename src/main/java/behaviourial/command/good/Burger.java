package behaviourial.command.good;


public class Burger implements Cook {
    @Override
    public void prepare() {
        System.out.println("Cook: Cooking burger.");
    }
}
