package creational.singleton.good;

/**
 * INTERVIEW
 */

/**
 1. it should have private constructor
 2. one static instance variable that return class object
 3. static method that can make class object only once

 more features:
    4.eager initialisation -> so that it will create one object when the code run
 */

/**
 * Problem : with eager initialisation -> you made an object but later on you didn't use in the code waste of memory
 */
public class BillingServiceEagerSingleton {
    // private Constructor
    private BillingServiceEagerSingleton(){
    }
    // one static variable --> initialize at the time of JVM insure only object
    private static BillingServiceEagerSingleton instance = new BillingServiceEagerSingleton();
    // static function return instance
    public static BillingServiceEagerSingleton getInstance(){
        return instance;
    }
}
