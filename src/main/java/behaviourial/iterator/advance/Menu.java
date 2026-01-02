package behaviourial.iterator.advance;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private String name;
    private List<MenuComponent> children = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        children.add(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<MenuComponent> getChildren() {
        return children;
    }
}
