import Account.Account;
import Account.Account2;
import Animal.Animal;
import Animal.Cat;
import Animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class App {

    private Animal cat = new Cat("Bob");
    private Animal dog = new Dog("Tom");
    private List<Animal> animalList = new ArrayList();

    private Account<String> acc = new Account("1234","Max");
    private Account<Integer> acc2 = new Account(new Integer(4321),"Den");

    private String id;
    private Integer id2;

    private Account2<String,Float> acc3 = new Account2("123",321);
    private Account2<String,Integer> acc4 = new Account2("123",new Integer(321));

    Number sum1 = acc3.getSum();
    Number sum2 = acc4.getSum();

    public static void main(String[] args) {
        App app = new App();
        System.out.println("------------Animal------------");
        app.initAnimal();
        app.runAnimal();
        System.out.println("------------Account------------");
        app.initAccount();
        app.runAccount();
        app.classCastException();
        System.out.println("------------Account2------------");
        app.runAccount2();
    }

    private void initAnimal(){
        animalList.add(dog);
        animalList.add(cat);
    }

    private void runAnimal(){
        System.out.println(animalList);
        dog.move();
        cat.move();
    }

    private void initAccount(){
        id = acc.getId();
        id2 = acc2.getId();
    }

    private void runAccount(){
        System.out.println(id);
        System.out.println(id2);
    }

    private void classCastException(){
        Object x = new Integer(10);
        if (x instanceof String){
            String s = (String)x;
            System.out.println(s);
        }
    }

    private void runAccount2(){
        System.out.println(sum1 + " " + sum2);
    }
}
