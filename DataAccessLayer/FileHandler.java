package DataAccessLayer;

public abstract class FileHandler {
    
    String basePath = "";

    public String getPath(){
        return basePath;
    }

    public abstract String readFromFile();
    public abstract boolean writeToFile(String text);
}
