package BridgeLabz_Java.generics;

import java.util.ArrayList;
import java.util.List;

// MealPlan interface
interface MealPlan {
    void display();
}

// Different meal types
class VegetarianMeal implements MealPlan {
    public void display() {
        System.out.println("Vegetarian Meal");
    }
}

class VeganMeal implements MealPlan {
    public void display() {
        System.out.println("Vegan Meal");
    }
}

class KetoMeal implements MealPlan {
    public void display() {
        System.out.println("Keto Meal");
    }
}

class HighProteinMeal implements MealPlan {
    public void display() {
        System.out.println("High Protein Meal");
    }
}


// Generic Meal class
class Meal<T extends MealPlan> {   // bounded generic

    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }
}


// Utility class
class MealUtils {

    // Generic method to generate meal
    public static <T extends MealPlan> void generateMeal(T meal) {
        meal.display();
    }
    // Wildcard method to display all meals
    public static void displayMeals(List<? extends MealPlan> meals) {
        for (MealPlan m : meals) {
            m.display();
        }
    }
}

public class PersonalizedMealPlanGenerator {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeals = new Meal<>();
        vegMeals.addMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(new VeganMeal());

        Meal<KetoMeal> ketoMeals = new Meal<>();
        ketoMeals.addMeal(new KetoMeal());

        Meal<HighProteinMeal> proteinMeals = new Meal<>();
        proteinMeals.addMeal(new HighProteinMeal());

        System.out.println("Generating Individual Meal:");
        MealUtils.generateMeal(new VegetarianMeal());

        System.out.println("\nAll Vegetarian Meals:");
        MealUtils.displayMeals(vegMeals.getMeals());

        System.out.println("\nAll Vegan Meals:");
        MealUtils.displayMeals(veganMeals.getMeals());

        System.out.println("\nAll Keto Meals:");
        MealUtils.displayMeals(ketoMeals.getMeals());

        System.out.println("\nAll High Protein Meals:");
        MealUtils.displayMeals(proteinMeals.getMeals());
    }
}