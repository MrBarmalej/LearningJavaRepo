package Lesson13;

import java.util.List;
import java.util.Scanner;

public class Students {
    /*Задача 3:
Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе.*/

    String name;
    String groupName;
    int course;
    double averMarks;


    public double getAverMarks() {
        return averMarks;
    }

    public void setAverMarks(double averMarks) {
        this.averMarks = averMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Students(String name, String groupName, int course, double averMarks) {
        this.name = name;
        this.groupName = groupName;
        this.course = course;
        this.averMarks = averMarks;
    }

}
