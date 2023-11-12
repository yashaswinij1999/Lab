public abstract class Q7 {

    public abstract void m1();

    public Q7(String name) {

        super();
        System.out.println(name);

    }

}

class Q9 extends Q7 {

    String name;

    public Q9(String name) {

        super(name);
        this.name = name;
        System.out.println(name + "name in  child");
    }

    public void m1() {

    }

}

class TestInterface {

    public static void main(String[] args) {

        Q9 q = new Q9("Animal");
        q.m1();

    }

}