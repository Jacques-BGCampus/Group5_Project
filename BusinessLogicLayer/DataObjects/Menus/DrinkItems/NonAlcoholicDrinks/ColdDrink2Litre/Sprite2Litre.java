package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink2Litre;

import BusinessLogicLayer.Abstractions.INonAlcoholicDrinks;

public class Sprite2Litre implements INonAlcoholicDrinks{
   
    @Override
    public String getItemName() {
        return "1 x 2l Sprite Regular";
    }

    @Override
    public double getPrice() {
        return 21.0d;
    }
}
