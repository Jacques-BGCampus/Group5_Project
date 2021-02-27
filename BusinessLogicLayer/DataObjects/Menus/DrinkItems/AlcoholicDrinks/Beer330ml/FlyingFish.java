package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrink;

public class FlyingFish implements IAlcoholicDrink {
    
    @Override
    public String getItemName() {
        return "6 x 330ml Flying Fish Beer";
    }

    @Override
    public double getPrice() {
        return 79.0d;
    }
}
