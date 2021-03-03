package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.MainCourses.AdultMainCourses;

import ServerSide.BusinessLogicLayer.Abstractions.AdultMainCourse;

public class HomeCookedMeal extends AdultMainCourse {

    @Override
    public String getItemName() {
        return "Bolonaise on a bed of Pasta";
    }

    @Override
    public double getPrice() {
        return 30.99;
    }

}
