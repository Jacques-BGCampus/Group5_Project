package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts;

import ServerSide.BusinessLogicLayer.Abstractions.Dessert;

public class CremeCaramel extends Dessert {

    @Override
    public String getItemName() {
        return "Creme Caramel";
    }

    @Override
    public double getPrice() {
        return 35.99;
    }

}
