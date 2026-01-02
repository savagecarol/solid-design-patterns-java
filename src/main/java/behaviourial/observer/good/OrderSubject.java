package behaviourial.observer.good;

// we will add all the observers
public interface OrderSubject {
    void addObserver(OrderObserver observer); // we will add all the observers
    void removeObserver(OrderObserver observer);   // we can remove observer
    void notifyObservers(String order);  // notify all the observer that are in the list
}
