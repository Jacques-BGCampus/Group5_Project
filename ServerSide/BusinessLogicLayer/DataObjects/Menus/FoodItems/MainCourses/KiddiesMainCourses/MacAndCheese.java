package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.MainCourses.KiddiesMainCourses;

import ServerSide.BusinessLogicLayer.Abstractions.KiddiesMainCourse;

public class MacAndCheese extends KiddiesMainCourse {

    @Override
    public String getItemName() {
        return "Mac and Cheese";
    }

    @Override
    public double getPrice() {
        return 45.99;
    }

}
