package Animal;

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
        String sb = "Dog{" + "name='" + name + '\'' +
                '}';
        return sb;
    }
}
