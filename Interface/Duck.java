public class Duck {

    int size;
    static int count;

    public Duck(int size) {
        this.size = size;
        count++;
        System.out.println("the no of duck created = " + count);
    }

    public void swim() {
        if (size == 5) {
            System.out.println("the duck swims slowest");
            return;
        }
        if (size == 10) {
            System.out.println("the duck swims slowly");
            return;
        }
        if (size == 15) {
            System.out.println("the duck swims the fasttest");
            return;
        }
        throw new IllegalArgumentException("please provide proper input");
    }
}

class TestDuck {

    public static void main(String[] args) {
        Duck d1 = new Duck(5);
        d1.swim();

        Duck d2 = new Duck(15);
        d2.swim();

        Duck d3 = new Duck(10);
        d3.swim();

        Duck d4 = new Duck(2);
        d4.swim();
    }
}