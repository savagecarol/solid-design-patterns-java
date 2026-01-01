package behaviourial.command.good;

public class Pizza implements Cook {
    @Override
    public void prepare() {
            System.out.println("Cook: Cooking pizza.");
    }
}
