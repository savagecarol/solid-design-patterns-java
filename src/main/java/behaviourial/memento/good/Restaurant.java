package behaviourial.memento.good;

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
 *  good code ::
 *
 *  Originator → object whose state we save
 *  Memento → snapshot of state
 *  Caretaker → manages saved states (undo history) ==> we will use stack data structure
 *
 */

public class Restaurant {

    public static void main(String[] args) {

        Order order = new Order();
        OrderEditor editor = new OrderEditor();

        order.update("Burger", false, false);
        editor.save(order.save()); // state :: 1 => to caretaker
        order.show();

        order.update("Burger", true, false);
        editor.save(order.save()); // state :: 2 => to caretaker
        order.show();

        order.update("Burger", true, true);  // state :: 3 => to caretaker
        order.show();

        System.out.println("\nUndo last change:");
        order.restore(editor.undo()); // state :: 2 => to caretaker we restored
        order.show();
    }
}
