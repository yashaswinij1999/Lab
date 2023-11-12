import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        int ch = 0;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        CountyandCapital cc = new CountyandCapital();

        String country;
        String capital;

        while (ch != 5) {

            System.out.println("");
            System.out.println("press 1 to add Country and Capital");
            System.out.println("press 2 sort the list based on the country ");
            System.out.println("press 3 to search for the capital given a country name");
            System.out.println("press 4 to sort the list based on capital");
            System.out.println("press 5 to exit ");
            System.out.println("");
            System.out.println("enter your choice");
            ch = sc1.nextInt();

            switch (ch) {

                case 1:

                    System.out.println("Enter the country name ");
                    country = sc1.next();

                    System.out.println("enter the capital name");
                    capital = sc1.next();

                    cc.addCountryandCapital(country, capital);
                    break;

                case 2:

                    System.out.println("to list based on country ");
                    String[] arr = cc.getAllDetails();

                    for (String s : arr) {

                        System.out.println(s);

                    }
                    break;

                case 3:
                    System.out.println("to search");

                    System.out.println("enter country name");
                    country = sc1.next();

                    cc.searchCapital(country);

                    break;

                case 4:
                    System.out.println("sort based on capital");
                    cc.sortBasedOnValue();
                    break;

                default:
                    System.out.println("invalid input");
                    break;

                case 5:
                    System.out.println("to exit");
            }

        }

    }

}
