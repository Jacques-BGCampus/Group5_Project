package ServerSide.BusinessLogicLayer.DataObjects.Themes.Decorations.BaptismDecorations;

import ServerSide.BusinessLogicLayer.Abstractions.BaptismDecoration;

public class Pool extends BaptismDecoration {

    @Override
    public String getItemName() {

        return "Indoor Pool";
    }

    @Override
    public double getPrice() {

        return 399.99;
    }

}
