package behaviourial.command.bad;


public class Burger implements Cook {
    @Override
    public void prepare() {
        System.out.println("Cook: Cooking burger.");
    }
}
