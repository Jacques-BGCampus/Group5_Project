package ServerSide.BusinessLogicLayer.DataObjects.Themes.Decorations.YearEndDecorations;

import ServerSide.BusinessLogicLayer.Abstractions.YearEndDecoration;

public class YearEndBalloon extends YearEndDecoration {

    @Override
    public String getItemName() {

        return "5 x Year-End Balloons";
    }

    @Override
    public double getPrice() {

        return 3.99;
    }

}
