package creational.singleton.bad;

// Ensure a class has only one instance and provide a global access point to it

// story: multiple customer are coming -> and giving orders to multiple waiter and they are depositng cash to one counter
// manager will ask for total amount at the end of day
public class Restaurant {
    public static void main(String[] args) {
            System.out.println("Customer 1 comes and give order to waiter 1 amount 100");
            BillingService billingServiceWaiter1 = new BillingService(); // billingservice 1
            billingServiceWaiter1.addInTotal(100);

            System.out.println("Customer 2 comes and give order to waiter 2 amount 200");
            BillingService billingServiceWaiter2 = new BillingService(); // billingservice 2
            billingServiceWaiter2.addInTotal(200);

            System.out.println("Customer 3 comes and give order to waiter 1 amount 50");
            billingServiceWaiter1.addInTotal(50);

            System.out.println("Manager is asking total amount of the day at the end");
            System.out.println(billingServiceWaiter1.total);
            System.out.println(billingServiceWaiter2.total);
            System.err.println("total was 350");

    }
}
