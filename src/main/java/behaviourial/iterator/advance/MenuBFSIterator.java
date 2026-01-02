package behaviourial.iterator.advance;

import java.util.LinkedList;
import java.util.Queue;

public class MenuBFSIterator implements Iterator<MenuComponent> {

    private Queue<MenuComponent> queue = new LinkedList<>();

    public MenuBFSIterator(MenuComponent root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public MenuComponent next() {
        MenuComponent current = queue.poll();

        for (MenuComponent child : current.getChildren()) {
            queue.add(child);
        }

        return current;
    }
}
