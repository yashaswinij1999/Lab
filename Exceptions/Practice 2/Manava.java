public class Manava {

    private String name;
    private int age;

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age");
        } else {
            this.age = age;
        }

    }

    public int getAge() {

        return age;

    }

}

class TestM {

    public static void main(String[] args) {

        Manava m = new Manava();
        m.setAge(-1);
        m.setName("");

    }

}