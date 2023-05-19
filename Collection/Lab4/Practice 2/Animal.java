import java.util.HashSet;
import java.util.Set;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 30) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public boolean equals(Object o1) {
        if (o1 instanceof Animal) {
            Animal a = (Animal) o1;

            if (this.name.equals(a.name) || this.age == a.age) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (name + age).hashCode();
    }

    public String toString() {
        return "name : " + name + "," + " age " + age;
    }

}

class testAnimal {

    public static void main(String[] args) {

        Animal a1 = new Animal("Parrot" ,15);
        Animal a2 = new Animal("pigeon" ,10);
        Animal a3 = new Animal("Parrot" ,15);

        Set<Animal>s1 = new HashSet<>();
        s1.add(a1);
        s1.add(a2);
        s1.add(a3);
        System.out.println(s1);
    }
}
