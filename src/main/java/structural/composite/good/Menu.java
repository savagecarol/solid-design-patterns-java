package structural.composite.good;

import java.util.ArrayList;
import java.util.List;


public class Menu implements MenuComponent {

    private String name;
    private List<MenuComponent> children = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println(name + ":");
        for (MenuComponent child : children) {
            child.display();
        }
    }
}
