package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink330ml;

import BusinessLogicLayer.Abstractions.INonAlcoholicDrinks;

public class Sprite330ml implements INonAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "6 x 330ml Sprite Can";
    }

    @Override
    public double getPrice() {
        return 59.0d;
    }
}
