package structural.composite.bad;

import java.util.List;

public class VegMenu {
    private List<String> items;

    public VegMenu(List<String> items) {
        this.items = items;
    }

    public void showVegMenu() {
        System.out.println("Veg Menu:");
        for (String item : items) {
            System.out.println("  - " + item);
        }
    }
}
