package Lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /*Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
    Stream'ов:
    - Удалить дубликаты
    - Оставить только четные элементы
    - Вывести сумму оставшихся элементов в стриме*/
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(5);
        int sum;
        list.stream()
                .distinct()
                .filter(p -> p%2 == 0)
                .forEach(System.out::println)
                ;


    }
}
