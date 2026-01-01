package behaviourial.command.good;

// BurgerOrderCommand.java
public class OrderCommand implements Command {
    private Cook cook;

    public OrderCommand(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.prepare();
    }
}
