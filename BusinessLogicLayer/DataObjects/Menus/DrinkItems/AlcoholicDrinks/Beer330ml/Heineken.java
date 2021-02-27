package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrink;

public class Heineken implements IAlcoholicDrink {
    
    @Override
    public String getItemName() {
        return "24 x 330ml Heineken Premium Lager Beer";
    }

    @Override
    public double getPrice() {
        return 294.0d;
    }
}
