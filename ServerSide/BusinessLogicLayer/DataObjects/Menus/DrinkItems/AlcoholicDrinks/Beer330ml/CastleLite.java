package ServerSide.BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import ServerSide.BusinessLogicLayer.Abstractions.Beer330ml;

public class CastleLite extends Beer330ml {
 
    @Override
    public String getItemName() {
        return "6 x 330ml Castle Lite Beer";
    }

    @Override
    public double getPrice() {
        return 74.0d;
    }
}
