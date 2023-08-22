package Lesson6;

import java.util.Scanner;

public class GivingMoney extends CreditCard{

    public GivingMoney() {
        Scanner scanner = new Scanner(System.in);
        int moneyGiver = scanner.nextInt();
        System.out.println("Give us your money!");
        this.currAccBalance = currAccBalance + moneyGiver;
        System.out.println("Your current balance is: " + currAccBalance);


    }


}