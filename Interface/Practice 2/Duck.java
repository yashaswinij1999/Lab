public class Duck {

    public static final int chota = 5;
    public static final int bada = 10;
    public static final int biggest = 15;
    static int count = 0;
    int size;

    public Duck(int size) {

        if (size != chota || size != bada || size != biggest) {

            throw new IllegalArgumentException("Invalid Input");

        } else {

            this.size = size;
            count++;
            System.out.println("the no of duck objects created  = " + count);

        }

    }

    public void swim() {

        if (chota == size) {
            System.out.println("the duck chota swims fastest");
            return;
        }

        if (bada == size) {
            System.out.println("the duck bada swims slowest");
            return;
        }

        if (biggest == size) {
            System.out.println("the duck bada swims slow");
            return;

        } else {

            throw new IllegalArgumentException("Invalid Input");

        }

    }

}

class TestDuck {

    public static void main(String[] args) {

        Duck d = new Duck(5);
        d.swim();

        Duck d2 = new Duck(10);
        d2.swim();

        Duck d3 = new Duck(15);
        d3.swim();

        Duck d4 = new Duck(Duck.bada);
        d4.swim();

        Duck d5 = new Duck(20);
        d5.swim();

    }

}
