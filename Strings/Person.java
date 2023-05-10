public class Person {

    private String name;
    private int age;
    String[] petNames = { "raju", "ranga", "deeksha", "rima", "nima", "teena", "timma", "leela", "ulljala", "chotu",
            "motu", "reshu", "nishu", "simba", "tommy", "water", "peter", "litre", "writer", "rama" };

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
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void dance() {

        if (age < 25) {
            System.out.println("a person can do chacha");
        } else {
            System.out.println("a person can do waltz");
        }
    }

    public void sing() {

        String song = "";
        int a;

        for (int i = 0; i < petNames.length; i++) {
            a = (int) (Math.random() * petNames.length);
            song = petNames[a];

        }
        System.out.println("song = " + song);

    }
}

class Test10 {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(40);
        System.out.println("p1.getAge = " + p1.getAge());
        p1.setName("Nikil");
        System.out.println("p1.setName = " + p1.getName());
        p1.dance();
        p1.sing();

    }
}