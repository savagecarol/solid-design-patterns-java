package behaviourial.memento.good;

import java.util.Stack;

// caretaker
public class OrderEditor {

    private Stack<OrderMemento> history = new Stack<>();

    public void save(OrderMemento memento) {
        history.push(memento);
    }

    public OrderMemento undo() {
         history.pop();
         return history.peek();
    }
}
