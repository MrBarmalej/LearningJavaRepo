package Lesson6;

import java.util.Scanner;

public class GettingMoney extends CreditCard {
    public GettingMoney(){
        System.out.println("How much money do you need?");
        Scanner scanner = new Scanner(System.in);
        int moneyGetter = scanner.nextInt();
        if (currAccBalance > moneyGetter){
            this.currAccBalance = currAccBalance - moneyGetter;
            System.out.println("Your current balance is: " + currAccBalance);

        } else {
            System.out.println("Sorry, you don't have that much");
        }

    }



}
