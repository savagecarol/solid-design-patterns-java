package structural.bridge.good;

//  now we have type also -> because we passed it in food
// and from here we can decide it is veg or non veg
public class Pizza extends Food {

    public Pizza(FoodType type) {
        super(type);
    }

    @Override
    void prepare() {
        System.out.print("Preparing Pizza - ");
        type.applyType();
    }
}
