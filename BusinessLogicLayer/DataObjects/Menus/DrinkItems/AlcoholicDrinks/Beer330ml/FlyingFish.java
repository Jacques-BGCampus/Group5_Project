package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrinks;

public class FlyingFish implements IAlcoholicDrinks {
    
    @Override
    public String getItemName() {
        return "6 x 330ml Flying Fish Beer";
    }

    @Override
    public double getPrice() {
        return 79.0d;
    }
}
