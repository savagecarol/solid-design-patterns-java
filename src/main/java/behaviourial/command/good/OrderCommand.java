package behaviourial.command.good;

/**
 * 1. order command is going to take action class
 * 2. order command is going to excecute the action
 */
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
