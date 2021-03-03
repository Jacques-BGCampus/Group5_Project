package ServerSide.BusinessLogicLayer.DataObjects.Themes.Decorations.WeddingDecorations;

import ServerSide.BusinessLogicLayer.Abstractions.WeddingDecoration;

public class Alter extends WeddingDecoration {

    @Override
    public String getItemType() {

        return "Decorations";
    }

    @Override
    public String getItemName() {

        return "Alter";
    }

    @Override
    public double getPrice() {

        return 89.99;
    }

}
