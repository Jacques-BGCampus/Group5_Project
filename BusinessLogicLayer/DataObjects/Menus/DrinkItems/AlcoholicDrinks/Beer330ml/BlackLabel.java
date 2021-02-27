package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrinks;

public class BlackLabel implements IAlcoholicDrinks {
 
    // If we need to be concerned about copyrights, we might want
    // to change some names/descriptions.
    @Override
    public String getItemName() {
        return "Johnnie Walker Black Label";
    }

    @Override
    public double getPrice() {
        return 240.0d;
    }
   
}
