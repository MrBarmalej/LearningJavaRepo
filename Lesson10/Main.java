package Lesson10;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        NewStrings newStrings = new NewStrings();
        String strMin;
        String strMax;
        String strMed;

        if (newStrings.str1.length() < newStrings.str2.length() && newStrings.str2.length() < newStrings.str3.length()) {
            strMin = newStrings.str1;
            strMax = newStrings.str3;
            strMed = newStrings.str2;
        } else {
            if (newStrings.str1.length() < newStrings.str2.length() & newStrings.str2.length() < newStrings.str3.length()) {
                if (newStrings.str1.length() < newStrings.str3.length()) {
                    strMin = newStrings.str1;
                    strMed = newStrings.str3;
                    strMax = newStrings.str2;
                } else {
                    strMin = newStrings.str2;
                    strMed = newStrings.str3;
                    strMax = newStrings.str1;
                }
            } else {
                strMin = newStrings.str3;
                strMed = newStrings.str2;
                strMax = newStrings.str1;
            }
        }

        // 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        //найденные строки и их длину

        System.out.println("Строка Max " + strMax + " длина строки " + strMax.length());
        System.out.println("Строка Min " + strMin + " длина строки " + strMin.length());
            /*2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
            значений их длины*/

        System.out.println("Строка Max " + strMax + " длина строки " + strMax.length());
        System.out.println("Строка Med " + strMed + " длина строки " + strMed.length());
        System.out.println("Строка Min " + strMin + " длина строки " + strMin.length());
            /*3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
            средней, а также их длину.*/
        double average = (double) (newStrings.str1.length() + newStrings.str2.length() + newStrings.str3.length()) / 3;
        System.out.println("Strings with lengths < average:");
        if (newStrings.str1.length() < average) {
            System.out.println(newStrings.str1 + " " + newStrings.str1.length());
        }
        if (newStrings.str2.length() < average) {
            System.out.println(newStrings.str2 + " " + newStrings.str2.length());
        }
        if (newStrings.str3.length() < average) {
            System.out.println(newStrings.str3 + " " + newStrings.str3.length());

        /*Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        Если таких слов несколько, найти первое из них.*/
            String delimeter = " ";
            String[] words = newStrings.str1.split(delimeter);

            System.out.println(Arrays.toString(words));

            /*Вывести на консоль новую строку, которой задублирована каждая буква из
            начальной строки. Например, "Hello" -> "HHeelllloo*/



            String[] words1;
            words1 = new String[words.length];
            for (int i = 0; i < words1.length; i++) {
                words1[i] = words[i] + words[i];

            }
            System.out.println(Arrays.toString(words1));

        }
    }
}

