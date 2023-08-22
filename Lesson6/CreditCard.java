package Lesson6;

import java.util.Scanner;

public class CreditCard
{
    int accNumber = 123456;
    int password = 1111;
    static int currAccBalance = 100;

    public static void main(String[] args) {
        ChekingIn chekingIn = new ChekingIn();
        // скорее всего реальные банкоматы проверяют по базам данных, но мне бы с этим разобраться
        System.out.println("What would you like to do?");
        System.out.println("1: Get money from account");
        System.out.println("2: Put money on account");
        System.out.println("3: Watch my account info");
        System.out.println("4: Finish current session");
        Scanner scanner = new Scanner (System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                GettingMoney gettingMoney = new GettingMoney();
                break;
            case 2:
                GivingMoney givingMoney = new GivingMoney();
                break;
            case 3:
                System.out.print("Your balance is ");
                System.out.println(currAccBalance);
                break;
            case 4:
                System.out.println("See you soon");
                break;
            default:
                System.out.println("Wrong number");
                break;

        }

    }
}
