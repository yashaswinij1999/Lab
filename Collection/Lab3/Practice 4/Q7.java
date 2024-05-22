
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int ch = 0;
        String capital = "";
        String country = "";

        CountryandCapital c = new CountryandCapital();;

        while (ch < 5) {

            System.out.println(" ");
            System.out.println("Press 1  to add Country and Capital");
            System.out.println("Press 2  to List Country and Capital");
            System.out.println("Press 3 to Search Capital");
            System.out.println("Press 4  to sorting based on country");
            System.out.println("Press 5  to sorting based on  Capital");
            System.out.println("Press 6  to exit");
            System.out.println(" ");

            System.out.println("Enter your choice");
            ch = sc1.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Country name");
                    country = sc1.next();

                    System.out.println("Enter Capital name");
                    capital = sc1.next();

                    c.addCountryandCapital(country, capital);
                    break;

                case 2:
                    System.out.println("Listing");
                    String[] details = c.getDetails();

                    for (String s : details) {
                        System.out.println(s);
                    }

                    break;

                case 3:
                    System.out.println("Enter country name");
                    country = sc1.next();
                    System.out.println(c.searchCapital(country));
                    break;

                case 4:
                    String[] sortedValues = c.sortCountry();

                    for (String s : sortedValues) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    c.sortOnValue();
                    break;

                default:
                    throw new AssertionError();

                case 6:
                    System.out.println("bye bye");
            }

        }

    }

}

class SortBasedOnValueComparator implements Comparator<Object> {

    public int compare(Object o1, Object o2) {

        return 0;

    }

}
