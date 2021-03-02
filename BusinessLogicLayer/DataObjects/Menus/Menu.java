package BusinessLogicLayer.DataObjects.Menus;

import java.util.ArrayList;
import java.util.List;

import BusinessLogicLayer.Abstractions.IMenuItem;

public class Menu {
    private List<IMenuItem> items;

    public Menu() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(IMenuItem item) {
        return items.add(item);
    }

    

}
