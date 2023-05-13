import java.net.PortUnreachableException;

public final class Person {

    final String name;
    final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Test {

    public static void main(String[] args) {

        Person p = new Person("ram", 10);

    }
}