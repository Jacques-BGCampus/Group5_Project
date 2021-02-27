package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Wine1Litre;

import BusinessLogicLayer.Abstractions.IAlcoholicDrink;

public class NederbergRose implements IAlcoholicDrink{
    
    @Override
    public String getItemName() {
        return "1 x 750ml Nederburg Rosé Wine Bottle";
    }

    @Override
    public double getPrice() {
        return 49.0d;
    }
}
