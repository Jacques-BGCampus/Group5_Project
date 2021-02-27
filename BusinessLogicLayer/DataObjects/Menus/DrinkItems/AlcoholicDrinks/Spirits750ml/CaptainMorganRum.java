package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Spirits750ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrink;

public class CaptainMorganRum implements IAlcoholicDrink {

    @Override
    public String getItemName() {
        return "1 x 750 ml Captain Morgan Black Jamaica Rum";
    }

    @Override
    public double getPrice() {
        return 179.0d;
    }
    
}
