package Lesson9;

import java.util.Objects;

public class Tiger implements Animal{
    protected String eat = "Meat";
    public String getEat() {
        return eat;
    }

    public String setEat(String eat) {
        if (!Objects.equals(eat, "Meat")) {
            System.out.println("Tigers don't eat " + eat);
            this.eat = eat;
        } else {
            System.out.println("Tigers are happy to eat " + eat);
            this.eat = eat;
        }
        return eat;
    }
    @Override
    public final String voice() {
        return "Roar";
    }

    @Override
    public final String eat() {
        return "Meat";
    }

}
