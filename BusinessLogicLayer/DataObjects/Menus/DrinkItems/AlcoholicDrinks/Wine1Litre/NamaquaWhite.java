package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Wine1Litre;

import BusinessLogicLayer.Abstractions.IAlcoholicDrinks;

public class NamaquaWhite implements IAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "5l Namaqua Sweet White";
    }

    @Override
    public double getPrice() {
        return 159.0d;
    }
}
