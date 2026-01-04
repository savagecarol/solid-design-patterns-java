package structural.facade.good;



public class RestaurantFacade {

    private Kitchen kitchen = new Kitchen();
    private Chef chef = new Chef();
    private Waiter waiter = new Waiter();
    private Billing billing = new Billing();

    public void serveCustomer() {
        kitchen.prepareFood();
        chef.cook();
        waiter.serve();
        billing.generateBill();
    }

    public void extraItems() {
        waiter.serve();
    }
}
