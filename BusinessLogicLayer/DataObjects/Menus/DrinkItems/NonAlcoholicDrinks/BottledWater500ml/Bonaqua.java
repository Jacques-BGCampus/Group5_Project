package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.BottledWater500ml;

import BusinessLogicLayer.Abstractions.INonAlcoholicDrinks;

public class Bonaqua implements INonAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "1 x 500ml Bonaqua Still Water Bottle";
    }

    @Override
    public double getPrice() {
        return 7.0d;
    }
}
