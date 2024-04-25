
public class Dog {

    private int age;

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("invalid age");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Dog(int age) {
        setAge(age);
        this.age = age;
        System.out.println("parametersied constructor");
    }

    public void bark() {

        if (age < 30) {
            System.out.println("the dog barks");
        } else {
            System.out.println("the dog meows");
        }

    }

}
class TestDog{

    public static void main(String[] args) {

        Dog d = new Dog(5);
        System.out.println(d.getAge());
        d.bark();
        
    }

}
