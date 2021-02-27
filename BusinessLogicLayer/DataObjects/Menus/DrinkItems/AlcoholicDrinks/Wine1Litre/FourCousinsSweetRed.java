package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Wine1Litre;

import BusinessLogicLayer.Abstractions.IAlcoholicDrink;

public class FourCousinsSweetRed implements IAlcoholicDrink{
    
    @Override
    public String getItemName() {
        return "1.5l Four Cousins Sweet Red";
    }

    @Override
    public double getPrice() {
        return 90.0d;
    }
}
