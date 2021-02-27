package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink330ml;

import BusinessLogicLayer.Abstractions.INonAlcoholicDrinks;

public class CreamSoda330ml implements INonAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "6 x 330ml Sparletta Creme Soda Can";
    }

    @Override
    public double getPrice() {
        return 52.0d;
    }
}
