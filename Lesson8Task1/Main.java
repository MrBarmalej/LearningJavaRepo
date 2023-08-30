package Lesson8Task1;

public class Main {
    public static void main(String[] args) {
        Printer worker = new Worker();
        Printer accountant = new Accountant();
        Printer director = new Director();
        worker.Printer();
        accountant.Printer();
        director.Printer();
    }
}
