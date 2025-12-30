package solid.interfaceSegregation.good;


public class Billing implements BillingStaff {


    @Override
    public void generateBill() {
        System.out.println("I can generate Bill");
    }
}
