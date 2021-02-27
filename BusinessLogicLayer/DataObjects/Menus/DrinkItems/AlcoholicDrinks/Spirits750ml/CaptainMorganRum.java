package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Spirits750ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrinks;

public class CaptainMorganRum implements IAlcoholicDrinks {

    @Override
    public String getItemName() {
        return "1 x 750 ml Captain Morgan Black Jamaica Rum";
    }

    @Override
    public double getPrice() {
        return 179.0d;
    }
    
}
