public class Person {

    private String name;
    private int age;
    static int count = 0;

    public Person() {

        System.out.println("in Person no-arg constr");
        count++;
    }

    public Person(String name) {
        this.setName(name);
        System.out.println("in person string param constr");
        count++;
    }

    public Person(String name, int age) {
        // this(name);
        this.setName(name);
        this.setAge(age);
        System.out.println("in person string,int param constr");
        this.age = age;
        this.name = name;
        count++;

    }

    public void setName(String name) {

        if (name == null || name.equals("") || name.length() > 30) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person("rama", 10);
        p1.setName("rama");
        p1.setAge(10);

        Person p2 = new Person();

        for (int i = 1; i < 100; i++) {

            Person p3 = new Person();
            System.out.println("no of objects created = " + Person.count);
        }

    }
}