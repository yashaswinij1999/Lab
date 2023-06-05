public class Q3 {

    public static void main(String[] args) {

        System.out.println("main starting");

        MyJob1 j1 = new MyJob1(1000);
        Thread t1 = new Thread(j1);
        t1.start();
        t1.setName("ranga");

        MyJob1 j2 = new MyJob1(10);
        Thread t2 = new Thread(j2);
        t2.start();
        t2.setName("vittala");

        System.out.println("main ending");

    }

}

class MyJob1 implements Runnable {

    private int value;

    public MyJob1(int value) {

        this.value = value;

    }

    public void run() {

        for (int i = value; i < value + 100; i++) {

            System.out.println("value = " + i + " name = " + Thread.currentThread().getName());

        }

    }
}
