import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class wordGame {
    private ArrayList<String> words = new ArrayList<>();
    private  boolean outcome = false;
    private  boolean continueORterminate = true;
    private   Scanner in = new Scanner(System.in);
    private  void gameStart(){
        String st = "empathy";
        System.out.println("Word Game started with empathy ");
        do {
            String lastletter = st.substring(st.length() - 1);
            String inp = Input();
            if (inp.charAt(0) != lastletter.charAt(0)){
                System.out.println("“Entered word is invalid or does not exist in the \n" +
                        "dictionary, please try again”");
            }
        }while (continueORterminate);
    }
    private  void gameRestart(){
        words.clear();
        outcome = false;
        continueORterminate = true;
    }

    private  boolean wordValid(String st) throws IOException {
        Loading_Data loader = new Loading_Data();
        LinkedHashSet<String> hs =loader.ReadData("dictionary.txt");
        return  hs.contains(st) ? true :false;
    }

    private  String Input(){

        System.out.println("Enter a word (caseSensitive) to play the game, such as \n" +
                "empathy->yet->top...: Yes");
        String line = in.next();
        return line;
    }


}
