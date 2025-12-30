package solid.interfaceSegregation.good;


public class Order implements OrderStaff {
    @Override
    public void takeOrder() {
        System.out.println("I can take order");
    }

}
