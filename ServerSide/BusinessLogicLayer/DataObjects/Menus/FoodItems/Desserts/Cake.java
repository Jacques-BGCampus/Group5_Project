package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts;

import ServerSide.BusinessLogicLayer.Abstractions.Dessert;

public class Cake extends Dessert {

    @Override
    public String getItemName() {
        return "Cake";
    }

    @Override
    public double getPrice() {
        return 49.99;
    }

}
