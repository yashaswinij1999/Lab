public class Animal {

}

class Pig extends Animal {

}

class TestEx {

    public void m1() {
        System.out.println("m1()");
        m2();
    }

    public void m2() {
        System.out.println("m2()");
        Animal a = new Pig();
        m3(a);

    }

    public void m3(Animal a) {
        System.out.println("m3()");
        Pig p = (Pig) a;
    }
}

class Test {

    public static void main(String[] args) {

        try {
            TestEx te = new TestEx();
            te.m1();

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}