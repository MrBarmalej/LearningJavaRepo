package Lesson13;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
class AnimalCollection {
    Queue<String> q;

    public Queue<String> getQ() {
        return q;
    }

    public void setQ(Queue<String> q) {
        this.q = q;
    }

    /*Задача 2:
            Создать класс, который будет хранить в себе коллекцию с названиями животных.
            Реализовать методы удаления и добавления животных по следующим правилам:
            добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
            объекта этого класса в main методе другого класса.*/
    protected AnimalCollection() {
        Queue<String> q = new LinkedList<>();
        q.add("dog");
        q.add("cat");
        q.add("dog");


    }
}
