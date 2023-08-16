package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4hwTask1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива > 0");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];


        /* ввод каждого значения массива для пробы(было в задании)
        for (int j = 0; j < size; j++)
        {
            System.out.println("Введите значиение массива № "+(j+1));
            arr1[j] = scanner.nextInt();
        }*/
        // рандомайзер
        for (int a = 0; a < size; a++) {
            arr1[a] = Math.round((float) (Math.random() * 100));
        }
        System.out.println("массив рандомных чисел в обычном порядке: ");
        System.out.println(Arrays.toString(arr1));

        for (int z = 0, y = size - 1; z < y; z++, y--) {
            int temp = arr1[z];
            arr1[z] = arr1[y];
            arr1[y] = temp;
        }
        System.out.println("а теперь наоборот");
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.print("сортируем и получаем: ");
        int min = arr1[0];
        int max = arr1[size - 1];
        System.out.println("минимальный " + min + "   " + "максимальный " + max);
        //да, немного не так, вероятно, нужно было делать, но дальше все равно "поиски" будут
        int q = 0;
        for (q = 0; q < size; q++) ;
        {
            int buf = 0;
            for (int j = 0; j < size - 1 - q; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    buf = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = buf;
                }

                System.out.println(buf);
            }
        }
    }

    }


