package Animal;

import static java.lang.String.format;

public class Cat extends Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("cat move");
    }

    @Override
    public String toString() {
        return format("Cat { name = '%s' }", name);
    }
}
