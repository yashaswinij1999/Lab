import javax.print.attribute.standard.MediaSize.NA;

public class Man {

    private String name;
    private int age;
    String[] petNames = new String[20];
    int count = 0;

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

    public Man() {
        System.out.println("no argument constructor in man");
    }

    public void dance() {
        if (age < 25) {
            System.out.println("a person can dance chacha");
        } else {
            System.out.println("a person can dance waltz");
        }
    }

    public void sing() {
        String song = "";

        for (int i = 0; i < petNames.length - 1; i++) {

            int names = (int) (20 * Math.random());

            song = song + " " + petNames[names];

        }
        System.out.println("song = " + song);
    }

    public void addPetNames(String name) {
        if (count < petNames.length) {
            petNames[count] = name;
            count++;
        }
    }

    public boolean searchName(String name) {

        for (String s : petNames) {
            if (s.equals(name)) {
                return true;
            }

        }
        return false;
    }

}

class TestMan {

    public static void main(String[] args) {

        Man m = new Man();
        m.setAge(100);
        m.dance();
        m.addPetNames("rajy");
        m.addPetNames("ramya");
        m.addPetNames("deeksha");
        m.addPetNames("gangana");
        m.addPetNames("dhanuja");
        m.addPetNames("deepa");
        m.addPetNames("leela");
        m.addPetNames("rosa");
        m.addPetNames("shrunga");
        m.addPetNames("dhanush");
        m.addPetNames("rangini");
        m.addPetNames("reeshma");
        m.addPetNames("sowmya");
        m.addPetNames("sheela");
        m.addPetNames("rakesha");
        m.addPetNames("amma");
        m.addPetNames("rama");
        m.addPetNames("prabha");
        m.addPetNames("friendu");
        m.addPetNames("esha");
        m.sing();
        System.out.println(" no of names added = " + m.count);
        boolean searchName = m.searchName("esha");
        System.out.println("searchName = " + searchName);

    }
}
