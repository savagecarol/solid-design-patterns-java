package behaviourial.iterator.bad;

/**
 *  Iterator Pattern provides a way to access elements of a collection sequentially
 *  without exposing the underlying data structure (array, list, tree etc.).
 *
 * Story::
 *  A Customer wants to browse the menu item by item.
 *  The customer should not care whether the menu is stored as an array, list, or anything else.
 *  The customer just wants:
 *  hasNext()
 *  next()
 *
 * Iterator gives us exactly that.
 *
 * // customer is directly accessing menu -->
 * think of this right now we have::
 *   pizza
 *   burger
 *   nachos
 *
 *   but now we have tree like menu::
 *   pizza
 *   burger:
 *      vegBurger
 *      non-vegBurger
 *      cheese Burger
 *   nachos
 *
 *   so customer should not care about :: about menu data structure he can traverse it.
 */
public class Restaurant {
    public static void main(String[] args) {

        Menu menu = new Menu();
        // Customer directly accessing list
        for (String item : menu.getItems()) {
            System.out.println("Menu Item: " + item);
        } // for loop
    }
}
