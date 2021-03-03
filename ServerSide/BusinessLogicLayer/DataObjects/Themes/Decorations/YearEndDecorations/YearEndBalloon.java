package BusinessLogicLayer.DataObjects.Themes.Decorations.YearEndDecorations;

import BusinessLogicLayer.Abstractions.YearEndDecor;

public class YearEndBalloon extends YearEndDecor {

    @Override
    public String getItemType() {

        return "Decoration";
    }

    @Override
    public String getItemName() {

        return "Year End Balloons";
    }

    @Override
    public double getPrice() {

        return 3.99;
    }

}
