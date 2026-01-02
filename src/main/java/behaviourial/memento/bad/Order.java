package behaviourial.memento.bad;

public class Order {
    public String item;
    public boolean cheese;
    public boolean drink;

    public void show() {
        System.out.println("Order: " + item +
                ", Cheese=" + cheese +
                ", Drink=" + drink);
    }
}
