public class Person {

    String name;
    int age;

    public void dance() {

        if (age > 0) {
            if (age < 30) {
                System.out.println("Person will do barathnatya");
            } else {
                System.out.println("Person will do snake dance");
            }
        }
        System.out.println( " invalid age input ");

    }

}

class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Rama";
        p1.age = -2;
        System.out.println("name = " + p1.name);
        p1.dance();

    }
}
