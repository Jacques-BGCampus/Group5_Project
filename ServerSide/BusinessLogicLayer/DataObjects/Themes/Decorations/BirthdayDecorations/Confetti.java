package ServerSide.BusinessLogicLayer.DataObjects.Themes.Decorations.BirthdayDecorations;

import ServerSide.BusinessLogicLayer.Abstractions.BirthdayDecoration;

public class Confetti extends BirthdayDecoration {

    @Override
    public String getItemType() {

        return "Decoration";
    }

    @Override
    public String getItemName() {

        return "Confetti";
    }

    @Override
    public double getPrice() {

        return 10.99;
    }

}
