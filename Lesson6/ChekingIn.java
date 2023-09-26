package Lesson6;

import java.util.Scanner;

public class ChekingIn extends CreditCard{
    public ChekingIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number(123456)");
        int yourAccNumber = scanner.nextInt();
        if (yourAccNumber == accNumber) {
            System.out.println("Enter the password(1111)");
            int pass = scanner.nextInt();
            if (pass == password) {
                System.out.println("Right password");
            } else {
                System.out.println("Wrong password. Please, try again");
            }
        } else {
            System.out.println("Wrong account number. Please, try again");
        }
    }

}