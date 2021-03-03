package BusinessLogicLayer.DataObjects.Themes.Decorations.BirthdayDecorations;

import BusinessLogicLayer.Abstractions.BirthdayDecoration;

public class BirthdayBalloons extends BirthdayDecoration {

    @Override
    public String getItemType() {

        return "Decoration";
    }

    @Override
    public String getItemName() {

        return "Birthday Balloons";
    }

    @Override
    public double getPrice() {

        return 3.99;
    }

}
