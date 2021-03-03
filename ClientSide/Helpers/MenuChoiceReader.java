package ClientSide.Helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuChoiceReader {

    // #region The following chunk of code is an implementation of the Singleton
    // Design Pattern
    private static MenuChoiceReader menuChoiceReaderInstance = new MenuChoiceReader();
    BufferedReader reader;

    private MenuChoiceReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static MenuChoiceReader getReaderInstance() {
        return menuChoiceReaderInstance;
    }
    // #endregion

    public int getUserMenuChoice() throws NumberFormatException, IOException {
        // If something goes wrong with getting the menu choice, -1 will be returned, so in the calling
        // class we must check to see if the menuchoice is -1 and handle it accordingly
        int menuChoice = -1;
        menuChoice = Integer.parseInt(reader.readLine());
        return menuChoice;
    }


}
