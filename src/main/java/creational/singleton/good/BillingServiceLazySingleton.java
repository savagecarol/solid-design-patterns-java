package creational.singleton.good;

/**
 * INTERVIEW
 */

/**
 1. it should have private constructor
 2. one static instance variable that return class object
 3. static method that can make class object only once

 more features:
    4. eager initialisation -> so that it will create one object when the code run
    5. lazy initialisation -> we have to take care of more things like multithreaded application
 */

public class BillingServiceLazySingleton {
    // private Constructor
    private BillingServiceLazySingleton(){
    }

    // one static variable
    private static BillingServiceLazySingleton instance = null;

    // static function that can make object only once
    public static BillingServiceLazySingleton getInstance(){
        if(instance  == null) {
            synchronized (BillingServiceLazySingleton.class) { // synchronized --> only one thread can run this code
                if (instance == null) { // second null check :: multiple thread can pass previous if check
                    instance = new BillingServiceLazySingleton();
                }
            }
        }
        return instance;
    }
}
