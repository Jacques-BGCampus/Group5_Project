package BusinessLogicLayer.DataObjects.Themes.Decorations.WeddingDecorations;

import BusinessLogicLayer.Abstractions.WeddingDecoration;

public class Flowers extends WeddingDecoration {

    @Override
    public String getItemType() {

        return "Decoration";
    }

    @Override
    public String getItemName() {

        return "Flowers";
    }

    @Override
    public double getPrice() {

        return 99.99;
    }

}
