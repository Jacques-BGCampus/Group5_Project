package ServerSide.BusinessLogicLayer.DataObjects.Themes.Decorations.BaptismDecorations;

import ServerSide.BusinessLogicLayer.Abstractions.BaptismDecoration;

public class BaptismBalloons extends BaptismDecoration {

    @Override
    public String getItemName() {

        return "5 x Baptism Balloons";
    }

    @Override
    public double getPrice() {

        return 2.99;
    }

}
