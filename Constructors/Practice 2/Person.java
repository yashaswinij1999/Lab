
public class Person {

    private String name;
    private int age;

    public Person() {
        System.out.println("no arg constructor in Person");
    }

    public void setName(String name) {

        if (name == null || name.equals("") || name.length() > 30) {
            return;
        }
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

}

class TestPerson {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("");
        p.setAge(15);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }

}
