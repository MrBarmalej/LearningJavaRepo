package Lesson9;

import java.util.Objects;

public class Rabbit implements Animal{
    protected String eat = "Grass";
    @Override
    public String voice() {
        return "https://www.youtube.com/watch?v=QvieRhiFz44";
    }

    @Override
    public String eat() {
        return "Grass";
    }

    public String setEat(String eat) {
        if (!Objects.equals(eat, "Grass")) {
            System.out.println("Rabbits don't eat ");
            this.eat = eat;
        } else {
            System.out.println("Rabbit eat " + eat);
            this.eat = eat;
        }
        return eat;
    }
}
