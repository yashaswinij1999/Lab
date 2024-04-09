
public class Person {

    String name;
    int age;

    public void dance(int age) {

        if (age > 0) {

            if (age < 30) {
                System.out.println("The person does Bharatanatya");
            } else {
                System.out.println("The person does snake dance");
            }

        }

    }

}

class TestPerson {

    public static void main(String[] args) {

        Person p = new Person();
        p.dance(30);
    

   
    }

}
