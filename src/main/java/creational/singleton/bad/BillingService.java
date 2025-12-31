package creational.singleton.bad;


public class BillingService  {
    int total = 0;
    void addInTotal(int amount){
            total+=amount;
    }
    int getTotal(){
        return total;
    }
}
