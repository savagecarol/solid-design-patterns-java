package behaviourial.template.good;

public class BurgerOrder extends FoodOrderTemplate {

    @Override
    protected void prepareFood() {
        System.out.println("Preparing burger");
    }
}
