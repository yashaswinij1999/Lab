
public class S4 {

    public static void main(String[] args) {

        tables(2, 5);

    }

    public static void tables(int first, int second) {

        int larger = 0;
        int smaller = 0;

        if (first > second) {
            larger = first;
            smaller = second;
        } else {
            larger = second;
            smaller = first;
        }

        for (int i = 1; i <= larger; i++) {

            System.out.println(smaller + " * " + i + " = " + smaller * i);

        }

    }

}
