package behaviourial.memento.good;

public class Order {

    private String item;
    private boolean cheese;
    private boolean drink;

    // update them
    public void update(String item, boolean cheese, boolean drink) {
        this.item = item;
        this.cheese = cheese;
        this.drink = drink;
    }

    // memento
    public OrderMemento save() {
        return new OrderMemento(item, cheese, drink);
    }

    // restore --> order memento it will help to resote
    public void restore(OrderMemento memento) {
        this.item = memento.getItem();
        this.cheese = memento.hasCheese();
        this.drink = memento.hasDrink();
    }

    public void show() {
        System.out.println("Order: " + item +
                ", Cheese=" + cheese +
                ", Drink=" + drink);
    }
}
