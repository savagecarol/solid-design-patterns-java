package structural.flyweight.good;

// Order holds extrinsic order info and references shared Pizza
class PizzaOrder {
    private Pizza pizza;  // shared
    private int size;
    private int tableNumber;

    public PizzaOrder(Pizza pizza, int size, int tableNumber) {
        this.pizza = pizza;
        this.size = size;
        this.tableNumber = tableNumber;
    }

    public void serve() {
        System.out.print("Serving " + size + " inch pizza with ");
        pizza.displayFlavor();
        System.out.println(" to table " + tableNumber);
    }
}
