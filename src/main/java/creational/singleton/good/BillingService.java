package creational.singleton.good;

import solid.interfaceSegregation.good.Billing;

// we have to make singleton class

// 1. it should have private constructor
// 2. one static instance variable that return class object
// 3. static method that can make class object only once
public class BillingService {

    // private Constructor
    private BillingService(){
    }

    private static BillingService instance = null; // null

    public static BillingService getInstance(){
        if(instance  == null) {
            instance =  new BillingService();
        }
        return instance;
    }

    int total = 0;

    void addInTotal(int amount){
        total+=amount;
    }
    int getTotal(){
        return total;
    }
}
