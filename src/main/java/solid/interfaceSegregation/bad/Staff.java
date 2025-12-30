package solid.interfaceSegregation.bad;

// staff can take Order , cook order , generate bill
public interface Staff {
    void takeOrder();
    void cookFood();
    void generateBill();
}
