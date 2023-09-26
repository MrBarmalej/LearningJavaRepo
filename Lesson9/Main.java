package Lesson9;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Animal rabbit = new Rabbit();
        Dog dog = new Dog();
        dog.setEat("Grass");
        tiger.setEat("Meat");
        tiger.voice();
        System.out.println(tiger.voice());
    }
}
