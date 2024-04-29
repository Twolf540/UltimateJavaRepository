package SideProjects.APPractice.Wordle;
import java.util.Scanner;

public class Wordle {
    private String word;
    private int guesses;
    private int length;
    public Wordle(String w, int g){
        word = w;
        guesses = g;
        length = w.length();
    }
    public void guess(){
        Scanner scan = new Scanner(System.in);
        String temp = "";
        int guesscount = 0;
        for(int i = 0; i < guesses; i++){
            System.out.println("What is your guess?");
            String temp2 = scan.next();
            guesscount++;
            for(int x = 0; x < word.length(); x++){
                if(word.substring(x, x + 1).equals(temp2.substring(x, x + 1))){
                    temp += word.substring(x, x+1);
                }
                else{
                    int count = 0;
                    for(int y = x + 2; y < temp2.length() - 2; y++){
                        if(word.substring(x, x+1).equals(temp2.substring(y, y + 1))){
                            temp += "+";
                            count++;
                        }
                    }
                    if(count == 0){
                        temp += "*";
                    }
                }
            }
            for(int z = 0; z < temp.length(); z += length){
                System.out.println(temp.substring(z, z + length));
            }
            if(temp.substring(temp.length() - length, temp.length()).equals(word)){
                i = guesses;
                System.out.println("Congratulations! You took " + guesscount + " guesses");
            }
            }
    }
    public static void main(String[] args) {
        Wordle w = new Wordle("quote", 5);
        w.guess();
    }
}
