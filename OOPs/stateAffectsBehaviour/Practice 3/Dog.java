
public class Dog {

    int age;
    String name;

    public void bark(int age) {

        for (int i = 0; i < age; i++) {

            if (age < 7) {
                System.out.println("Dog Barking");
            } else {
                System.out.println("Dog Meows");
            }

        }

    }

}

class Test {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.bark(5);
        System.out.println(d.age);

    }

}
