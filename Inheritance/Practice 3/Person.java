
public class Person {

    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid person name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 100) {
            throw new IllegalArgumentException("person already dead");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class TestPerson {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("rama");
        System.out.println(p.getName());
        p.setAge(10);
        System.out.println(p.getAge());

    }

}
