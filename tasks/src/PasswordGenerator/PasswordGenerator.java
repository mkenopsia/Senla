package PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    static char[] UpperCaseLetters = "QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
    static char[] LowerCaseLetters = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
    static char[] Numbers = "1234567890".toCharArray();
    static char[] Symbols = "!@#$%^&*()_+".toCharArray();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите длину пароля (от 8 до 12 символов): ");
        int len = input.nextInt();
        String SecuryPassword = Generate(len, rand);
        System.out.println(SecuryPassword);

    }
    static String Generate(int len, Random rand) {
        String Password="";
        boolean u,l,n,s;
        u=l=n=s=false;
        for(int i = 0; i <= len; i++){
            int caser = rand.nextInt(4);
            switch(caser){
                case 0:
                    Password += UpperCaseLetters[rand.nextInt(UpperCaseLetters.length)];
                    u=true;
                    break;
                case 1:
                    Password += LowerCaseLetters[rand.nextInt(LowerCaseLetters.length)];
                    l=true;
                    break;
                case 2:
                    Password += Numbers[rand.nextInt(Numbers.length)];
                    n=true;
                    break;
                case 3:
                    Password += Symbols[rand.nextInt(Symbols.length)];
                    s=true;
                    break;
            }
        }
        if(u && l && n && s == true) return Password;
        else return Generate(len, rand);
    }
}
