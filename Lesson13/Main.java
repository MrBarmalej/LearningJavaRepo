package Lesson13;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Задача 1:
        Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        При решении использовать коллекции.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers with ',' between");
        String numbers = scanner.nextLine();
        String[] words = numbers.split(",");
        Set<String> items = new HashSet<>(Arrays.asList(words));
        //использовал хэш, т.к. нужны только уникальные значения
        System.out.println(items);


        AnimalCollection animals = new AnimalCollection();
        animals.getQ();

        List <Students>studArr = new ArrayList<>();
        Students student1 = new Students("Vasya","22zx",6,4.5);
        studArr.add(student1);
        Students student2 = new Students("Mateusz", "33pa",3,2.9);
        studArr.add(student2);
        System.out.println(student1);
        if (student1.averMarks < 3){
            studArr.remove(student1);
        }
        if (student2.averMarks < 3){
            studArr.remove(student2);
        }
        System.out.println(Arrays.toString(studArr.toArray()));


    }
    protected void printStudents(List<Students> students, int course){

    }



}
