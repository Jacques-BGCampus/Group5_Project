package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Wine1Litre;

import BusinessLogicLayer.Abstractions.IAlcoholicDrinks;

public class FourCousinsSweetRed implements IAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "1.5l Four Cousins Sweet Red";
    }

    @Override
    public double getPrice() {
        return 90.0d;
    }
}
