import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Loading_Data loader = new Loading_Data();
        LinkedHashSet<String> hs =loader.ReadData("dictionary.txt");


    }
    private static String Input(String st){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word (caseSensitive) to play the game, such as "+st);
        String line = in.next();
        return line;
    }
}
