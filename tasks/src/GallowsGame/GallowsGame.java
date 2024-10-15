package GallowsGame;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class GallowsGame {
    public static void main(String[] args){
        String[] words = new String[] {"человек","панорама","виселица","кровать",
        "мороженое","самолёт","велосипед","тетрадь","смартфон","простыня","холодильник"};

        Random rand = new Random();
        String GameWord=words[rand.nextInt(words.length)];

        GallowsGame(GameWord);
    }

    private static void GallowsGame(String word){
        ArrayList<Character> mistakes = new ArrayList<>();
        char[] GameWord = word.toCharArray();
        char[] ResultWord = new char[GameWord.length];
        for (int i = 0; i < word.length(); i++) ResultWord[i]='_';
        int life=5;
        int lettersRemain = word.length();
        boolean win = false;
        Scanner input = new Scanner(System.in);
        while(life!=0 && !win) {
            System.out.print("Слово: ");
            for (int i = 0; i < word.length(); i++) System.out.print(ResultWord[i] + " ");
            System.out.print("\nОшибки: ");
            for (int i : mistakes) {
                System.out.print((char)i + " ");
            }
            System.out.print("\nВведите букву: ");
            String in = input.next();
            char step = in.charAt(0);
            boolean check = false;
            for(int i =0;i<GameWord.length;i++){
                if(GameWord[i]==step) {
                    ResultWord[i]=step;
                    check=true;
                    --lettersRemain;
                }
                if(lettersRemain==0) {
                    win = true;
                    System.out.println("\n\tВы отгадали слово!");
                    String result = new String(ResultWord);
                    System.out.println("\t\t" + result.toUpperCase());
                    break;
                }
            }
            if(!check){
                mistakes.add(step);
                --life;
                if (life==0) System.out.println("\n\tВы проиграли!");
            }
        }
    }

}
