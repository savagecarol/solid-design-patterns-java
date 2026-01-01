package structural.composite.bad;

import java.util.List;

public class NonVegMenu {
    private List<String> items;

    public NonVegMenu(List<String> items) {
        this.items = items;
    }

    public void showNonVegMenu() {
        System.out.println("Non-Veg Menu:");
        for (String item : items) {
            System.out.println("  - " + item);
        }
    }
}
