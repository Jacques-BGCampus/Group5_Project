package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink2Litre;

import BusinessLogicLayer.Abstractions.INonAlcoholicDrinks;

public class Coke2Litre implements INonAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "1 x 2l Coca-Cola Original Soft Drink";
    }

    @Override
    public double getPrice() {
        return 22.0d;
    }
}
