public class Person {

    private String name;
    private int age;
    String[] petNames = new String[20];
    int count = 0;

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid name");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge() {

        if ((age < 0) || (age > 100)) {
            throw new IllegalArgumentException("invalid age");
        } else {
            this.age = age;
        }
    }

    public void dance() {

        if (age > 0) {

            if (age < 25) {
                System.out.println(" the person can dance chacha");
            } else {
                System.out.println("the person can dance waltz");
            }
        } else {
            throw new IllegalArgumentException("Please give proper age");
        }

    }

    public void addPetNames(String name) {

        if (count < petNames.length) {
            petNames[count] = name;

            count++;
        }

    }

    public boolean searchName(String name) {

        boolean isFound = true;

        for (String s : petNames) {

            if (!s.equals(name)) {
                isFound = false;
                break;
            }

        }
        return isFound;

    }

    public void sing() {

        String song = "";

        for (int i = 0; i < count; i++) {

            int x = (int) (Math.random() * count);
            song = song + " " + petNames[x];

        }
        System.out.println("the person sings song = " + song);

    }

}

class TestPerson {

    public static void main(String[] args) {

        Person p = new Person();
        p.addPetNames("ramu");
        p.addPetNames("ranga");
        p.addPetNames("krishna");
        p.addPetNames("raju");
        p.sing();

        System.out.println(p.searchName("ammu"));

    }

}
