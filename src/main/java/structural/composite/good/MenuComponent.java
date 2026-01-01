package structural.composite.good;

public interface MenuComponent {
    void display();
    default void add(MenuComponent component) {
        throw new UnsupportedOperationException("Add not supported");
    }
}

