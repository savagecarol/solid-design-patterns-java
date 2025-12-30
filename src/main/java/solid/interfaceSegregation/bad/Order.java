package solid.interfaceSegregation.bad;

public class Order implements Staff{
    @Override
    public void takeOrder() {
        System.out.println("I can take order");
    }

    @Override
    public void cookFood() {
        throw new RuntimeException("No billing");
    }

    @Override
    public void generateBill() {throw new RuntimeException("No Billing");}
}
