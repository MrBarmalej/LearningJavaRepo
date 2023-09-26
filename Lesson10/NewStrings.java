package Lesson10;

import java.util.Scanner;

// Ввести 3 строки с консоли
class NewStrings {
    protected String str1;
    protected String str2;
    protected String str3;


    protected NewStrings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 строку");
        str1 = scanner.nextLine();
        System.out.println("Введите 2 строку");
        str2 = scanner.nextLine();
        System.out.println("Введите 3 строку");
        str3 = scanner.nextLine();
    }
}
