package structural.composite.good;


/**
 * Composite Pattern is used when objects are organized in a tree structure.
 *
 * // Hierarchy
 *
 * Main Menu:
 *      Veg Menu:
 *          Burger:
 *              veggie Burger
 *              cheese Burger
 *          Pizza
 *          nachos
 *      Non-Veg Menu:
 *          Chicken Burger
 *          Chicken Pizza
 *
 * customer :: want to make menu like this
 *
 * Bridge :: his is not variation like Bridge. This is hierarchy like a tree.
 *
 */

public class Restaurant {

        public static void main(String[] args) {

            // main menu
            Menu mainMenu = new Menu("Main Menu");

            // child  menu 1
            Menu vegMenu = new Menu("Veg Menu");


            MenuItem pizza = new MenuItem("Pizza");
            MenuItem nachos = new MenuItem("Nachos");
            MenuItem burger = new MenuItem("Burger");

            // multiple burger options so in menuItem we can add more MenuItem
            MenuItem veggieBurger = new MenuItem("Veggie Burger");
            MenuItem cheeseBurger = new MenuItem("Cheese Burger");

            burger.add(veggieBurger);
            burger.add(cheeseBurger);

            vegMenu.add(pizza);
            vegMenu.add(nachos);
            vegMenu.add(burger);

            // child  menu 2
            Menu nonVegMenu = new Menu("Non-Veg Menu");
            MenuItem chickenPizza = new MenuItem("Chicken Pizza");
            MenuItem chickenBurger = new MenuItem("Chicken Burger");

            nonVegMenu.add(chickenPizza);
            nonVegMenu.add(chickenBurger);

            // adding child menu in parent menu
            mainMenu.add(vegMenu);
            mainMenu.add(nonVegMenu);

            mainMenu.display();
        }
}

// lol you can apply facade pattern and hide all the complexities of making menu in main function

