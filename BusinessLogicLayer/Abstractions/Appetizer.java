package BusinessLogicLayer.Abstractions;

public abstract class Appetizer implements IFoodItem {
    String itemType;

    @Override
    public String getItemType() {
        return "Appetizer";
    }
}
