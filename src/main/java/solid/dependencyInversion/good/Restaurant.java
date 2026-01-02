package solid.dependencyInversion.good;

//High-level modules should not depend on low-level modules. Both should depend on abstractions.
// order service will take the string "pizza" or "burger" not actually start making it -> it will send it to food
public class Restaurant {
        public static void main(String[] args) {
            System.out.println("Customer enters restaurant");

            Food pizza = new Pizza();
            OrderService orderService1 = new OrderService(pizza); // dont know it is pizza or burger it is taking it as food
            orderService1.processOrder();

            Food burger = new Burger();
            OrderService orderService2 = new OrderService(burger);
            orderService2.processOrder();
        }
}
