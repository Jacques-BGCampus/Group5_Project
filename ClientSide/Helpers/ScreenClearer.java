package ClientSide.Helpers;

public class ScreenClearer {
    
    private ScreenClearer() {

    }
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     }
}
