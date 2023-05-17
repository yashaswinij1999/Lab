import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CountryandCapital cc1 = new CountryandCapital();
        Map<String, String> m = new TreeMap<>();
        int ch = 0;
        String country;
        String capital;

        while (ch != 6) {
            System.out.println("Press 1 :Add Country and Capital");
            System.out.println("Press 2 :List Country and Capital");
            System.out.println("Press 3 :Search capital given country name");
            System.out.println("Press 4 :Sort based on country");
            System.out.println("Press 5 :sort based on capital");
            System.out.println("Press 6 :to exit");
            System.out.println("Enter your choice ");
            ch = sc.nextInt();
            System.out.println("choice entered = " + ch);

            switch (ch) {

                case 1:
                    System.out.println("Enter country name");
                    country = sc.next();

                    System.out.println("Enter capital name");
                    capital = sc.next();
                    cc1.add(country, capital);
                    break;

                case 2:
                    String[] details = cc1.getAllDetails();

                    for (String s : details) {
                        System.out.println("List Country and Capital = " +  s);
                    }
                    break;

                case 3:
                    System.out.println("Enter country name");
                    String str = sc.next();
                    String countryName = cc1.getCapital(str);
                    System.out.println("Country " + str + " Capital = " + countryName);
                    break;

                case 4:
                    
                    cc1.sort();
                    break;

                case 5:
                    cc1.sortingOnValue();
                    break;

                default:
                    System.out.println("Enter proper input");
                    break;

                case 6:
                    System.out.println("OK tata bye bye");

            }
        }
    }

}
