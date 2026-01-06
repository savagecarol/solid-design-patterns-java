package behaviourial.iterator.bad;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<String> items = new ArrayList<>();

    public Menu() {
        items.add("Pizza");
        items.add("Burger");
        items.add("Nachos");
    }

    // Exposing internal structure
    public List<String> getItems() {
        return items;
    }
}
