public class Dog {

    int age;
    String name;

    public void bark(int age) {

        if (age < 7) {

            for (int i = 1; i <= age; i++) {

                System.out.println("the dog barks");
            }

        } else {
            
            for (int i = 1; i <= age; i++) {

                System.out.println("the dog meows");
            }

        }
    }

}

class TestDog {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.bark(10);

    }
}