package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Wine1Litre;

import BusinessLogicLayer.Abstractions.IAlcoholicDrink;

public class NamaquaWhite implements IAlcoholicDrink{
    
    @Override
    public String getItemName() {
        return "5l Namaqua Sweet White";
    }

    @Override
    public double getPrice() {
        return 159.0d;
    }
}
