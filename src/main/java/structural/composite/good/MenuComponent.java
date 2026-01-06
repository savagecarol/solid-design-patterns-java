package structural.composite.good;

/**
 * interface
 * 1. in which we have
 */
public interface MenuComponent {
    void display();
    default void add(MenuComponent component) {
        throw new UnsupportedOperationException("Add not supported");
    }
}

