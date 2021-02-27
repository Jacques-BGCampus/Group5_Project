package BusinessLogicLayer.DataObjects.Themes.Decorations.BaptismDecorations;

import BusinessLogicLayer.Abstractions.BaptismDecoration;

public class BaptismBalloons extends BaptismDecoration {

    @Override
    public String getItemType() {

        return "Decorations";
    }

    @Override
    public String getItemName() {

        return "Baptism Balloon";
    }

    @Override
    public double getPrice() {

        return 2.99;
    }

}
