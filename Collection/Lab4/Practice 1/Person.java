import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void setName(String name) {

        if (name != null && !name.equals(" ")) {
            this.name = name;
        }
        throw new IllegalArgumentException("Invalid Name Input");

    }

    public String getName() {

        return name;

    }

    public void setAge(int age) {

        if (age > 0 && age < 100) {

            this.age = age;

        }
        throw new IllegalArgumentException("Invalid age Input");
    }

    public int getAge() {

        return age;
    }

    public boolean equals(Object o1) {

        if (o1 instanceof Person) {

            Person p = (Person) o1;

            if (this.name.equals(p.name) && this.age == p.age) {
                return true;
            } else {
                return false;
            }
        }
        throw new IllegalArgumentException("Invalid Object passed in equals method");

    }

    public int hashCode() {

        return (name + age).hashCode();
    }

    public String toString() {

        return " name = " + name + " " + " age = " + age;

    }

}

class Test {

    public static void main(String[] args) {

        Person p1 = new Person("nandini", 23);
        Person p2 = new Person("yashu", 24);
        Person p3 = new Person("rama", 60);
        Person p4 = new Person("rama", 60);
        Person p5 = new Person("amma", 50);

        List<Person> l = new ArrayList<Person>();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        System.out.println("p3.equals(p4) = " + p3.equals(p4));

    }
}