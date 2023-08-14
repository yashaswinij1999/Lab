public class Animal {

}

class Pig extends Animal {

}

class TestEx {

    public static void m3(Animal a) {
        System.out.println("in m3()");
        Pig p = (Pig) a;
    }

    public static void m2() {
        System.out.println("in m2()");
        Animal a = new Pig();
        // m3(a);
        Pig p = new Pig();
        m3(p);
    }

    public static void m1() {
        System.out.println("m1()");
        m2();
    }

    public static void main(String[] args) {

        try {

            m1();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}