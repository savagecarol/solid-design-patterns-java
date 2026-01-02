package behaviourial.iterator.advance;

public class MenuItem extends MenuComponent {

    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
