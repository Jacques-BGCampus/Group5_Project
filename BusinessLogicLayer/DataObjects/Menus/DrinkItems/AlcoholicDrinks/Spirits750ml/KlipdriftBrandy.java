package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Spirits750ml;

import BusinessLogicLayer.Abstractions.IAlcoholicDrink;

public class KlipdriftBrandy implements IAlcoholicDrink{

    @Override
    public String getItemName() {
        return "1 x 200ml Klipdrift Brandy Bottle";
    }

    @Override
    public double getPrice() {
        return 49.0d;
    }
    
}
