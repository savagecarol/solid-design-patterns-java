package solid.singleResponsibility.good;

import solid.singleResponsibility.bad.CommonService;

// there are multiple people in restaurant ,and they focus on there work
public class Restaurant {

    public static void main(String[] args) {
        // person1 -> focus on taking order [one responsibility]
        OrderService orderService = new OrderService();
        orderService.orderFood();
        // person2 -> focus on kitchen work [one responsibility]
        KitchenService kitchenService = new KitchenService();
        kitchenService.kitchenWork();
        // person2 -> focus on billing [one responsibility]
        BillingService billingService = new BillingService();
        billingService.billing();
    }
}
