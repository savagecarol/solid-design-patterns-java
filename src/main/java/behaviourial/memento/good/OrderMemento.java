package behaviourial.memento.good;

// Manager State
public class OrderMemento {

    private final String item;
    private final boolean cheese;
    private final boolean drink;

    public OrderMemento(String item, boolean cheese, boolean drink) {
        this.item = item;
        this.cheese = cheese;
        this.drink = drink;
    }

    String getItem() { return item; }
    boolean hasCheese() { return cheese; }
    boolean hasDrink() { return drink; }
}
