package creational.prototype.good;


/**
 * Prototype Pattern creates new objects by copying an existing object.
 * Story 1 : Same meal ordered again → recreate manually.
 *
 * use cloneable interface and implement it
 * and override clone function and pass all the parameter
 *
 * --> usually use it when creating of object is very heavy - example - so many parameters
 * it can help you do actual work -> you will not waste time on creating object
 */

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    public static void main(String[] args) {
        // --------------------------------------------------
        // SIMPLE PROTOTYPE
        // --------------------------------------------------
        System.out.println(">>> BASIC PROTOTYPE EXAMPLE");
        System.out.println("Customer places first meal order");

        Meal meal1 = new Meal("Pizza", "Coke", true);

        System.out.println("Customer wants the SAME meal again (clone)");
        Meal meal2 = meal1.clone();

        System.out.println("Second customer changes drink");
        meal2.setDrink("Red Bull");

        System.out.println("\nOriginal Meal:");
        meal1.showMeal();

        System.out.println("Cloned Meal:");
        meal2.showMeal();

        // --------------------------------------------------
        // SHALLOW COPY
        // --------------------------------------------------
        System.out.println("\n>>> SHALLOW COPY PROBLEM");

        List<Extra> extras = new ArrayList<>();
        extras.add(new Extra("Olives"));

        System.out.println("Customer orders meal with extras");
        MealShallow shallowMeal1 =
                new MealShallow("Pizza", "Coke", extras);

        System.out.println("Same meal is cloned (shallow copy)");
        MealShallow shallowMeal2 = shallowMeal1.clone();

        System.out.println("Second customer adds Jalapeno extra");
        shallowMeal2.addExtra("Jalapeno");

        System.out.println("\nOriginal Meal:");
        shallowMeal1.showMeal();

        System.out.println("Cloned Meal:");
        shallowMeal2.showMeal();

        System.out.println("Both meals changed! This is a shallow copy issue.");

        // --------------------------------------------------
        // DEEP COPY
        // --------------------------------------------------
        System.out.println("\n>>> DEEP COPY SOLUTION");

        List<Extra> extras2 = new ArrayList<>();
        extras2.add(new Extra("Olives"));

        System.out.println("Customer orders meal with extras");
        MealDeepCopy deepMeal1 =
                new MealDeepCopy("Pizza", "Coke", extras2);

        System.out.println("Same meal is cloned (deep copy)");
        MealDeepCopy deepMeal2 = deepMeal1.clone();

        System.out.println("Second customer adds Jalapeno extra");
        deepMeal2.addExtra("Jalapeno");

        System.out.println("\nOriginal Meal:");
        deepMeal1.showMeal();

        System.out.println("Cloned Meal:");
        deepMeal2.showMeal();

        System.out.println("Meals are independent. Deep copy works correctly.");
    }
}
