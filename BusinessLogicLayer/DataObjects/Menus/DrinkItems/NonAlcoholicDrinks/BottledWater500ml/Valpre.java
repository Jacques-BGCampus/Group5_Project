package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.BottledWater500ml;

import BusinessLogicLayer.Abstractions.INonAlcoholicDrinks;

public class Valpre implements INonAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "1 x 500ml Valpre Sparkling Water";
    }

    @Override
    public double getPrice() {
        return 9.0d;
    }
}
