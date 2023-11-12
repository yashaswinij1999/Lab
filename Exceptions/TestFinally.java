public class TestFinally {

    public int m1() {
        int x = 10;
        try {
            TestFinally tf = null;
            tf.m1();
            System.out.println("in m1() x=" + x);
            return ++x;
        } catch (Exception e) {
            System.out.println("in catch of m1() " + e.getMessage());
            return ++x;
        } finally {
            TestFinally tf = null;
            tf.m1();
            System.out.println("in finally() of m1() x = " + x);
            
        }
    }

}

class TestING {

    public static void main(String[] args) {

        try{
            TestFinally tf = new TestFinally();
            System.out.println(tf.m1());
        }
        catch(Throwable e){
            e.printStackTrace();
        }

    }
}