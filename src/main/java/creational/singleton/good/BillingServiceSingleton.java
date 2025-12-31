package creational.singleton.good;

/**
 * INTERVIEW
 */

/**
    1. it should have private constructor
    2. one static instance variable that return class object
    3. static method that can make class object only once

*/
public class BillingServiceSingleton {

    // private Constructor
    private BillingServiceSingleton(){
    }

    // one static variable
    private static BillingServiceSingleton instance = null;

    // static function that can make object only once
    public static BillingServiceSingleton getInstance(){
        if(instance  == null) {
            instance =  new BillingServiceSingleton();
        }
        return instance;
    }


}
