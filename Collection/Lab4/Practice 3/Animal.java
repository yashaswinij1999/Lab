import java.util.HashSet;
import java.util.Set;

public class Animal {

    int age;
    String name;

    public Animal() {

    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.equals("") || name == null) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }

    }

    public boolean equals(Object o1) {

        if (o1 instanceof Animal) {

            Animal a = (Animal) o1;

            if (this.name.equals(a.name) && this.age == a.age) {
                return true;
            }

        }
        return false;

    }

    public int hashCode() {

        return (name + age).hashCode();

    }

    public String toString() {

        return " name: " + name + " age:" + age;

    }

}

class TestAnimal {

    public static void main(String[] args) {

        Set<Animal> t = new HashSet<>();
        Animal a1 = new Animal(18, "Zebra");
        Animal a2 = new Animal(18, "Zebra");
        Animal a3 = new Animal(18, "Donkey");

        t.add(a1);
        t.add(a2);
        t.add(a3);
        System.out.println(t);

    }
}