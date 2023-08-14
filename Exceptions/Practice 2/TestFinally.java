public class TestFinally {

    public int m1() {

        int x = 10;

        try {

            System.out.println("in m1() x=" + x);
            return ++x;

        } catch (Exception e) {

            System.out.println("in catch of m1() " + e.getMessage());
            return ++x;

        } finally {

            Manava m = null;
            System.out.println(m.age);
            System.out.println("in finally() of m1() x = " + x);

        }
    }

}

class Test {

    public static void main(String[] args) {

        try {

            TestFinally f = new TestFinally();

            f.m1();

        } catch (NullPointerException e) {

            // TODO: handle exception
            e.fillInStackTrace();

        }

    }

}

class Manava {

    int age;
    int size;

}
