package Lesson15;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth date formatted as yyyy-MM-dd");
        /*Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        когда пользователю исполнится 100 лет. Использовать Date/Time API.*/
        /*
        String birthDate = scanner.nextLine();
        LocalDate userBirthDate = LocalDate.parse(birthDate);
        LocalDate userOld = userBirthDate.plusYears(100);
        System.out.println("User will be 100 years old on " + userOld)

        //Используя Predicate среди массива чисел вывести только те, которые являются положительными.
        List<Integer> nums= Arrays.asList(-1,2,4,-6,8,9,-44,55,-77,66,-18,0);
        int [] arr = {-1,2,4,-6,8,9,-44,55,-77,66,-18,0};
        Predicate<Integer> isPos = i -> i >= 0;
        for (int i = 0; i < arr.length; i++){
            if (isPos.test(arr[i])){
                System.out.println(arr[i]);
            }
        }

         */
        /*Используя Function реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        возвращать сумму, переведенную сразу в доллары.*/
        System.out.println("Enter your BYN amount");
        double byn = scanner.nextDouble();
        Function<Double, Double> convert = x -> x/3.3;
        double usd = convert.apply(byn);
        System.out.println("That's " + usd + " USD");

        /*Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        выводить сумму, переведенную сразу в доллары.*/

        Consumer<Double> convert1 = y -> {
            double v = y / 3.3;
            System.out.println("That's " + v + " USD");
        };
        convert1.accept(byn);

        /*Используя Supplier написать метод, который будет возвращать введенную с консоли
        строку задом наперед.*/
        System.out.println("Enter your string");
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();//почему-то так работает, а без второго ввода не работает:(
        Supplier<String> viceVersa = () -> new StringBuilder(str1).reverse().toString();
        System.out.println(viceVersa.get());






    }

}

