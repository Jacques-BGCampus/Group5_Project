package ServerSide.BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import ServerSide.BusinessLogicLayer.Abstractions.Beer330ml;

public class Heineken extends Beer330ml {
    
    @Override
    public String getItemName() {
        return "24 x 330ml Heineken Premium Lager Beer";
    }

    @Override
    public double getPrice() {
        return 294.0d;
    }
}
