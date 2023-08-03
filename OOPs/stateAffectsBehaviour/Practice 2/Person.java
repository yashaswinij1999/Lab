public class Person {

    int age;
    String name;

    public void dance() {

        if (age < 30) {
            System.out.println("the person named " + name + " can dance barthanatya ");
        } else {
            System.out.println("the person named " + name + " can dance snake dance ");
        }

    }

}

class TestPerson {

    public static void main(String[] args) {

        Person p = new Person();
        p.name = "Arjuna";
        p.age = 35;
        p.dance();
    }

}
