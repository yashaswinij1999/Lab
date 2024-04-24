
public class Person {

    private String name;
    private int age;
    static int count = 0;

    public Person() {
        System.out.println("no arg constructor in Person");
        count++;
    }

    public Person(String name) {
        this.name = name;
        setName(name);
        System.out.println("Constructor with name argument ");
        count++;
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
        this.name = name;
        this.age = age;
        System.out.println("Constructor with name and age argument");
        count++;
    }

    public void setName(String name) {

        if (name == null || name.equals("") || name.length() > 30) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("invalid age");
        }

    }

    public int getAge() {
        return age;
    }

}

class TestPerson {

    public static void main(String[] args) {

        /* 
        Person p = new Person();
        p.setName("raju");
        p.setAge(12);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        Person p1 = new Person();
        p1.setAge(15);
        p1.setName("rahul");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        
        Person p2 = new Person("rani", 12);
        System.out.println(p2.getAge());
        System.out.println(p2.getName());
        System.out.println("no of Objects created = " + p2.count);

        for(int i = 0 ; i <= 100 ;i++){

            Person pi = new Person();
        }
        System.out.println("no of Objects created = " + p2.count);
        */
    }

}
