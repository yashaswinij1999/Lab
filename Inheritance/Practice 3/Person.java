
public class Person {

    private String name;
    private int age;
    String[] petNames = new String[20];
    int count = 0;

    public void dance() {
        if (age < 25) {
            System.out.println("a person can dance chacha");
        } else {
            System.out.println("A person can dance waltz");
        }
    }

    public void addPetNames(String name) {

        if (count < petNames.length) {
            petNames[count] = name;
            count++;
            System.out.println("name added successfully");
        }
    }

    public String sing() {

        String s = "";

        for (int i = 0; i < petNames.length; i++) {

            int random = (int) (Math.random() * petNames.length);
            s += petNames[random];

        }
        return s;

    }

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
        p.dance();

        p.addPetNames("rama");
        p.addPetNames("shama");
        p.addPetNames("bhama");
        String song = p.sing();
        System.out.println(song);


    

    }

}
