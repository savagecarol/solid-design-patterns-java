package structural.composite.good;

import java.util.ArrayList;
import java.util.List;

public class MenuItem implements MenuComponent {

    private String name;
    private List<MenuComponent> subMenuItems = new ArrayList<>();

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        subMenuItems.add(component);
    }

    @Override
    public void display() {
        System.out.println("  - " + name);
        for (MenuComponent subItem : subMenuItems) {
            System.out.print("    ");
            subItem.display();
        }
    }
}
