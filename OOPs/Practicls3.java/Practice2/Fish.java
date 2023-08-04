public class Fish {

    String name;

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid name in the fish class");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

}

class Croc {

    String name;

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid name in the fish class");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void eat(Fish f) {

        System.out.println("a croc " + name + " eating a fish " + f.name);
        f = null;

        f = new Fish();
        f.setName("Flippy");
        System.out.println("a croc " + name + " eating a fish " + f.name);

    }

}

class TestFish {

    public static void main(String[] args) {

        Fish f = new Fish();
        f.setName("Fishy");
        System.out.println(f.getName());

        Croc c = new Croc();
        c.setName("crocky");

        System.out.println("fish name before calling eat " + f.getName());
        c.eat(null);
        System.out.println("fish name after calling eat " + f.getName());
    }

}