package ServerSide.BusinessLogicLayer.Abstractions;

public abstract class Dessert implements IFoodItem {

    public String getItemType() {
        return "Dessert";
    }
}
