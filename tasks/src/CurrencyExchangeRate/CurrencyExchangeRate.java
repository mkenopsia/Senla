package CurrencyExchangeRate;

import java.util.Scanner;

public class CurrencyExchangeRate {
    static double USD = 96.1,EUR = 105.49,BYN = 29.19,CNY = 13.5,TRY = 2.81;;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите свою валюту: " +
                "\n1. USD" +
                "\n2. EUR" +
                "\n3. BYN" +
                "\n4. CNY" +
                "\n5. TRY ");
        int choice = input.nextInt();
        System.out.println("Введите сумму: ");
        double sum = input.nextDouble();
        System.out.println("Выберите валюту для конвертации: " +
                "\n1. USD" +
                "\n2. EUR" +
                "\n3. BYN" +
                "\n4. CNY" +
                "\n5. TRY ");
        int convert = input.nextInt();
        switch (choice){
            case 1:
                sum*=USD;
                break;
            case 2:
                sum*=EUR;
                break;
            case 3:
                sum*=BYN;
                break;
            case 4:
                sum*=CNY;
                break;
            case 5:
                sum*=TRY;
                break;

        }
        switch (convert){
            case 1:
                sum/=USD;
                break;
            case 2:
                sum/=EUR;
                break;
            case 3:
                sum/=BYN;
                break;
            case 4:
                sum/=CNY;
                break;
            case 5:
                sum/=TRY;
                break;

        }
        System.out.println(sum);
    }
}
