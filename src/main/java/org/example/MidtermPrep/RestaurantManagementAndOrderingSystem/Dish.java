package org.example.MidtermPrep.RestaurantManagementAndOrderingSystem;

public class Dish extends MenuItem{
    private CuisineType cuisineType; // The type of cuisine
    private String mainIngredient; // Main ingredient of the dish.

    public Dish(String code, String name, double price, CuisineType cuisineType, String mainIngredient) {
        super(code, name, price);
        this.cuisineType = cuisineType;
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String getDescription() {
        return "Type: " + this.cuisineType + "\n" +
                "Main Ingredient: " + this.mainIngredient;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
}
