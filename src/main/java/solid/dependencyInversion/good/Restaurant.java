package solid.dependencyInversion.good;

//High-level modules should not depend on low-level modules. Both should depend on abstractions.

public class Restaurant {
        public static void main(String[] args) {
            System.out.println("Customer enters restaurant");

            Food pizza = new Pizza();
            OrderService orderService1 = new OrderService(pizza);
            orderService1.processOrder();

            Food burger = new Burger();
            OrderService orderService2 = new OrderService(burger);
            orderService2.processOrder();
        }
}
