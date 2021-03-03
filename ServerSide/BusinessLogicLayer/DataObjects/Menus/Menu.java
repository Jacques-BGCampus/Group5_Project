package ServerSide.BusinessLogicLayer.DataObjects.Menus;

import java.util.ArrayList;
import java.util.List;

import ServerSide.BusinessLogicLayer.Abstractions.IDrinkItem;
import ServerSide.BusinessLogicLayer.Abstractions.IFoodItem;
import ServerSide.BusinessLogicLayer.Abstractions.IMenuItem;

public class Menu {
    private List<IMenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public boolean addItem(IMenuItem item) {
        return menuItems.add(item);
    }

    // Get the total cost of all MenuItems that happen to be FoodItems
    public double getTotalFoodCost() {
        double total = 0.0;
        for (IMenuItem iMenuItem : menuItems) {
            if (iMenuItem instanceof IFoodItem) {
                total += iMenuItem.getPrice();
            }
        }
        return total;
    }

    // Get the total cost of all MenuItems that happen to be DrinkItems
    public double getTotalDrinksCost() {
        double total = 0.0;
        for (IMenuItem iMenuItem : menuItems) {
            if (iMenuItem instanceof IDrinkItem) {
                total += iMenuItem.getPrice();
            }
        }
        return total;
    }
}
