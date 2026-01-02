package behaviourial.memento.bad;

/**
 *
 * Memento Pattern allows you to capture and restore an object’s internal state without exposing its internal structure.
 *
 *
 * Restaurant Order Editing (Undo Feature) :: in machine
 * Customer is editing an order before confirming:
 *
 * Burger
 * Burger + Cheese
 * Burger
 * Burger + Cheese
 * Burger + cheese + coke
 *
 * Customer clicks Undo → system should revert to previous order.
 *
 *  This is NOT workflow
 *  This is NOT behavior change
 *  This is pure snapshot & restore
 *
 * we have 3 roles in memento::
 * Originator → object whose state we save
 * Memento → snapshot of state
 * Caretaker → manages saved states (undo history)
 *
 *  problems::
 *      Undo logic is manual
 *      No history support
 *      Not scalable
 *
 */

public class Restaurant {

    public static void main(String[] args) {

        Order order = new Order();

        order.item = "Burger";
        order.cheese = false;
        order.drink = false;
        order.show();

        order.cheese = true;
        order.show();

        // Manual undo (bad)
        order.cheese = false;
        order.show();
    }
}
