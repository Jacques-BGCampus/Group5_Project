package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Spirits750ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrinks;

public class BellsWhiskey implements IAlcoholicDrinks {

    @Override
    public String getItemName() {
        return "1 x 750ml Bell's Blended Scotch Whisky";
    }

    @Override
    public double getPrice() {
        return 229.0d;
    }
    
}
