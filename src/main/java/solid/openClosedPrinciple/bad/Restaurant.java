package solid.openClosedPrinciple.bad;

// Software entities should be open for extension but closed for modification
// Story 2 - kitchen Chaos
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Customer enters restaurant");
        KitchenService kitchenService = new KitchenService();
        kitchenService.cook("Pizza");
        kitchenService.cook("Burger");
        kitchenService.cook("IceCream");
        kitchenService.cook("");
    }
}
