package ClientSide.PresentationLayer;

import java.io.IOException;

import ClientSide.Helpers.MenuChoiceReader;
import ClientSide.Helpers.ScreenClearer;

public class LandingPage {

    public static void main(String[] args) {
        try {
            runLandingPage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void runLandingPage() throws IOException {
        // First clear the screen
        ScreenClearer.clearScreen();

        // Ask if the user wants to sign IN or sign UP
        System.out.println("MS. RACHAEL WELCOMES YOU TO DELICIOUS CATERING!");
        System.out.println("***********************************************************************************************\n");
        System.out.println("1. SIGN IN");
        System.out.println("2. SIGN UP");
        System.out.println("3. EXIT");
        System.out.println("***********************************************************************************************\n");

        int menuChoice = MenuChoiceReader.getReaderInstance().getUserMenuChoice();

        switch (menuChoice) {
            case 1:
                // Begin sign in process
                runSignInProcess();
                break;
            case 2: 
                // Begin sign up process
                runSignUpProcess();
                break;
            case 3: 
                // Exit
                System.exit(0);
                break;
            default: 
                runLandingPage();
                break;
        }
    }

    private static void runSignInProcess() {
        //
    }

    private static void runSignUpProcess() {
        //
    }

}
