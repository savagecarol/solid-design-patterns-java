package behaviourial.iterator.advance;

import java.util.Collections;
import java.util.List;


public abstract class MenuComponent {

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public List<MenuComponent> getChildren() {
        return Collections.emptyList();
    }
}
