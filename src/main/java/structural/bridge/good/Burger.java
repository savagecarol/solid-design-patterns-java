package structural.bridge.good;

//  now we have type also -> because we passed it in food
// and from here we can decide it is veg or non veg
public class Burger extends Food {

    public Burger(FoodType type) {
        super(type);
    }

    @Override
    void prepare() {
        System.out.print("Preparing Burger - ");
        type.applyType();
    }
}
