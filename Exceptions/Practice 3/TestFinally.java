
public class TestFinally {

    public int m1() {
        int x = 10;
        try {

            System.out.println("in m1() x=" + x);
            return ++x;

        } catch (Exception e) {

            Person p = null;
            p.eat();
            System.out.println("in catch of m1() " + e.getMessage());
            return ++x;

        } finally {

            System.out.println("in finally() of m1() x = " + x);

        }
    }

}

class Test {

    public static void main(String[] args) {

        try {

            TestFinally t = new TestFinally();
            int result = t.m1();
            System.out.println(result);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}

class Person {

    public void eat() {

    }

}
