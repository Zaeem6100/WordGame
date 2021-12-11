import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class wordGame {
    private ArrayList<String> words = new ArrayList<>();
    private  boolean outcome = false;
    private  boolean continueORterminate = true;
    private   Scanner in = new Scanner(System.in);
    public   void gameStart(){
        String st = "empathy";
        System.out.println("Word Game started with empathy ");
        do {
            String lastletter = st.substring(st.length() - 1);
            String inp = Input();
            if (inp.charAt(0) != lastletter.charAt(0) ){
                System.out.println("“Entered word is invalid or does not exist in the \n" +
                        "dictionary, please try again”");
                if (st == words.get(words.size() - 1)){
                    gameRestart();
                    return;
                }
            }


        }while (continueORterminate);
    }
    public   void gameRestart(){
        words.clear();
        outcome = false;
        continueORterminate = true;
        System.out.println("Game Restarted ");
        gameStart();
    }

    public   boolean wordValid(String st) throws IOException {
        Loading_Data loader = new Loading_Data();
        LinkedHashSet<String> hs =loader.ReadData("dictionary.txt");
        return  hs.contains(st) ? true :false;
    }

    private  String Input(){

        String line;
        do {
            System.out.println("Enter a word (caseSensitive) to play the game, such as \n" +
                    "empathy->yet->top...: Yes");
            line = in.next();
            if(isStringOnlyAlphabet(line)){
                return line;
            }else {
                System.out.println("Wrong input !!!! input must be Characters only");
            }
        }while (true);
    }

    private  boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }


}
