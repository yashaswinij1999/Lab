
public class Persons {

    int age;
    String name;

    public void eat() {

        if (age < 40) {
            System.out.println("The person eats less");
        } else {
            System.out.println("the person eats more");
        }

    }

    public void sleep() {

        if (age < 40) {
            System.out.println("The person sleeps more");
        } else {
            System.out.println("The person sleeps less");
        }

    }

}

class TestPerson {

    public static void main(String[] args) {

        Persons p = new Persons();
        p.age = 35;
        p.eat();
        p.sleep();

    }

}
