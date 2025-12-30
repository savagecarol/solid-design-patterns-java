package solid.openClosedPrinciple.bad;


// whenever something new will come we have to make changes in complete code of kitchen Service
// example new Dish :: FrenchFries you will add one more if Condition that is wrong
public class KitchenService {

    public void cook(String item)
    {
        if(item == "pizza")
            System.out.println("Pizza ...");
        else if(item == "Burger")
            System.out.println("Burger ...");
        else if(item == "IceCream")
            System.out.println("IceCream ...");
        else
            System.out.println("Water ...");
    }

}
