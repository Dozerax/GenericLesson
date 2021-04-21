package Animal;

import static java.lang.String.format;

public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("dog move");
    }

    @Override
    public String toString() {
        return format("Dog { name = '%s' }", name);
    }
}
