package solid.interfaceSegregation.bad;

public class Billing implements Staff {

    @Override
    public void takeOrder() {throw new RuntimeException("no order");}

    @Override
    public void cookFood() {
        throw new RuntimeException("no cooking");
    }

    @Override
    public void generateBill() {
        System.out.println("I can generate Bill");
    }
}
