package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.MainCourses.AdultMainCourses;

import ServerSide.BusinessLogicLayer.Abstractions.AdultMainCourse;

public class Kota extends AdultMainCourse {

    @Override
    public String getItemName() {
        return "Sausage, Cheese, fries in a half loaf";
    }

    @Override
    public double getPrice() {
        return 15.99;
    }

}
