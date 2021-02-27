package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Wine1Litre;

import BusinessLogicLayer.Abstractions.IAlcoholicDrinks;

public class NederbergRose implements IAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "1 x 750ml Nederburg Rosé Wine Bottle";
    }

    @Override
    public double getPrice() {
        return 49.0d;
    }
}
