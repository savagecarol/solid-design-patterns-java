package behaviourial.iterator.good;
import java.util.List;

public class MenuIterator implements Iterator {
    private List<String> items;

    private int index = 0;

    public MenuIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    } // think of this tree like structure we whould have using bfs/dfs

    @Override
    public String next() {
        return items.get(index++);
    }
    // think of this tree like structure we would have using bfs/dfs
}
