package behaviourial.iterator.good;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<String> items = new ArrayList<>();

    public Menu() {
        items.add("Pizza");
        items.add("Burger");
        items.add("Nachos");
    }

    public Iterator createIterator() {
        return new MenuIterator(items);
    }
}
