package solid.interfaceSegregation.good;


public class Waiter implements WaiterStaff {
    @Override
    public void takeOrder() {
        System.out.println("I can take order");
    }

}
