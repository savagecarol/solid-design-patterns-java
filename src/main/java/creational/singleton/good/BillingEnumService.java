package creational.singleton.good;

/**
 * Enum guarantees only one instance in Java.
 * It is thread-safe, serialization-safe, and cloning-safe by default.
 * That’s why enum is the best way to implement Singleton.
 *
 * ENUM : enum is a special Java type used to represent a fixed set of constants.
 *  A CLASS with fixed number of objects possible -> example RestaurantJourneyEnum [ORDERED,COOKING,BILLING]
 */

public enum BillingEnumService {
    INSTANCE; // single instance
    private int total = 0;

    public void addInTotal(int amount) {
        total += amount;
    }

    public int getTotal() {
        return total;
    }
}
