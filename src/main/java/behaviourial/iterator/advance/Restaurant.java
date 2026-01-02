package behaviourial.iterator.advance;

/**
 * Main Menu
 *  ├── Veg Menu
 *  │    ├── Pizza
 *  │    ├── Burger
 *  │    │    ├── Veggie Burger
 *  │    │    └── Cheese Burger
 *  │    └── Nachos
 *  └── Non-Veg Menu
 *       ├── Chicken Pizza
 *       └── Chicken Burger
 */

public class Restaurant {

    public static void main(String[] args) {
        /**
         * making menu
         */
        Menu mainMenu = new Menu("Main Menu");
        Menu vegMenu = new Menu("Veg Menu");
        Menu nonVegMenu = new Menu("Non-Veg Menu");
        Menu burgerMenu = new Menu("Burger");
        burgerMenu.add(new MenuItem("Veggie Burger"));
        burgerMenu.add(new MenuItem("Cheese Burger"));
        vegMenu.add(new MenuItem("Pizza"));
        vegMenu.add(burgerMenu);
        vegMenu.add(new MenuItem("Nachos"));
        nonVegMenu.add(new MenuItem("Chicken Pizza"));
        nonVegMenu.add(new MenuItem("Chicken Burger"));
        mainMenu.add(vegMenu);
        mainMenu.add(nonVegMenu);
        /**
         * menu created
         */

        // BFS traversal
        Iterator<MenuComponent> iterator = new MenuBFSIterator(mainMenu);
        System.out.println("BFS Menu Traversal:\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}

