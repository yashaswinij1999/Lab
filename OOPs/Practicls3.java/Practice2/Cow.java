public class Cow {

    private String name;

    public void setName(String name) {

        if (name.equals("") || name == null) {
            throw new IllegalArgumentException("Invalid name");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void moo() {

        System.out.println(" I can moo my name = " + name);
    }

}

class TestCow {

    public static void main(String[] args) {

        Cow c = new Cow();
        c.setName("Lakshmi");
        System.out.println("name = " + c.getName());

        Cow c1 = new Cow();
        c1.setName("Gowri");
        System.out.println("name = " + c1.getName());

        c = c1;
        c.moo();

        c.setName("geetha");
        c.moo();

        c1.moo();

    }
}