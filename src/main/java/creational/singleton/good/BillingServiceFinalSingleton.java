package creational.singleton.good;

import java.io.Serializable;


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

 6. Serializable -> read resolve -> Serializable means converting an object into bytes so it can be saved or sent, and later recreated.
 7. cloneable -> stop cloning -> we have to stop cloning because of reflection
 */


public class BillingServiceFinalSingleton implements Serializable,Cloneable {
    // private Constructor
    private BillingServiceFinalSingleton(){
    }

    // one static variable
    private static BillingServiceFinalSingleton instance = null;

    // static function that can make object only once
    public static BillingServiceFinalSingleton getInstance(){
        if(instance  == null) {
            synchronized (BillingServiceFinalSingleton.class) { // synchronized --> only one thread can run this code
                if (instance == null) { // second null check :: multiple thread can pass previous if check
                    instance = new BillingServiceFinalSingleton();
                }
            }
        }
        return instance;
    }

    // Serializable
   protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() {
        // Return same instance
        return instance;
    }
}
