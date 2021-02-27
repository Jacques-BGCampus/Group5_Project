package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrink;

public class CastleLite implements IAlcoholicDrink {
 
    @Override
    public String getItemName() {
        return "6 x 340ml Castle Lite Beer";
    }

    @Override
    public double getPrice() {
        return 74.0d;
    }
}
