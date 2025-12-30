package solid.interfaceSegregation.bad;

public class Chef implements Staff {

    @Override
    public void takeOrder() {throw new RuntimeException("No order");}

    @Override
    public void cookFood() {
        System.out.println("i can cook");
    }

    @Override
    public void generateBill() {
        throw new RuntimeException("No Billing");
    }
}
