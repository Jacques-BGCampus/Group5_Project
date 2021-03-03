package ServerSide.BusinessLogicLayer.Abstractions;

public abstract class WineBoxOrBottle implements IAlcoholicDrink {
    
    @Override
    public String getItemType() {
        return "1 litre bottle of wine.";
    }
}
