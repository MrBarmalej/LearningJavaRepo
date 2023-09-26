package Lesson9;

import java.util.Objects;

class Dog implements Animal {
    protected String eat = "Meat";
    protected String voice = "Woof";
    @Override
    public String voice() {
        return "Woof";
    }

    @Override
    public final String eat() {
        return "Meat";
    }


    public String getEat() {
        return eat;
    }

    public String setEat(String eat) {
        if (!Objects.equals(eat, "Meat")) {
            System.out.println("Dogs don't eat " + eat);
            this.eat = eat;
        } else {
            this.eat = eat;
        }
        return eat;
    }


}
