
public class Duck {

    int size;
    static int count = 0;

    public Duck(int size) {
        if (size > 0) {
            this.size = size;
        }
        count++;
    }

    public void swim() {

        if (size == 5 || size == 15 || size == 10) {
            if (size == 5) {
                System.out.println("the duck chota swims fastest");
            }
            if (size == 10) {
                System.out.println("the duck bada swims slow");
            }
            if (size == 15) {
                System.out.println("the duck biggest swims slowest");
            }
        } else {
            throw new IllegalArgumentException("invalid size");
        }

    }

}

class TestDuck {

    public static void main(String[] args) {

        Duck d = new Duck(5);
        d.swim();

        Duck d1 = new Duck(15);
        d1.swim();

        Duck d2 = new Duck(10);
        d2.swim();

        System.out.println(Duck.count);

    }

}
