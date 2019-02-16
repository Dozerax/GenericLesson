package Animal;

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
        String sb = "Cat{" + "name='" + name + '\'' +
                '}';
        return sb;
    }
}
