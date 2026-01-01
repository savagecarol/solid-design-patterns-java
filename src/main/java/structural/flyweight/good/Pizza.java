package structural.flyweight.good;

// Shared intrinsic pizza flavor info
class Pizza {
    private String dough;
    private String sauce;
    private String toppings;

    public Pizza(String dough, String sauce, String toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void displayFlavor() {
        System.out.print(dough + " dough with " + sauce + " sauce and " + toppings);
    }
}
