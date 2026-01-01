package structural.flyweight.bad;

class Pizza {
    private String dough;
    private String sauce;
    private String toppings;
    private int size;
    private int tableNumber;

    public Pizza(String dough, String sauce, String toppings, int size, int tableNumber) {
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
        this.size = size;
        this.tableNumber = tableNumber;
    }

    public void serve() {
        System.out.println("Serving " + size + " inch pizza with " + toppings + " to table " + tableNumber);
    }
}
