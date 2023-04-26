import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        CountryandCapital c1 = new CountryandCapital();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int ch = 0;
        String country, capital = "";

        while (ch != 5) {

            System.out.println("Press 1 to add the country and Capitals");
            System.out.println("Press 2 to search the country and Capitals");
            System.out.println("Press 3 to list the country and Capitals");
            System.out.println("Press 4 to sort based on country ");
            System.out.println("Press 5 to exit");

            System.out.println("Please choose your option ");
            ch = sc1.nextInt();
            System.out.println(" option entered = " + ch);

            switch (ch) {

                case 1:
                    System.out.println("adding");
                    System.out.println("Please provide country name ");
                    country = sc1.next();
                    System.out.println("Please add capital name");
                    capital = sc1.next();
                    c1.addCountryandCapitalName(country, capital);
                    break;

                case 2:
                    System.out.println("searching");
                    System.out.println("please enter country name to search capital");
                    String s1 = sc1.next();
                    String s2 = c1.getCapital(s1);
                    System.out.println(" capital = " + s2);
                    break;

                case 3:
                    System.out.println("listing");
                    String[] details = c1.getAllDetails();

                    for (String s : details) {
                        System.out.println("all details = " + s);
                    }
                    break;

                case 4:
                    System.out.println("sorting");
                    String[] sort = c1.sortedDetails();
                    for (String s3 : sort) {
                        System.out.println(" sorting of countries = " + s3);
                    }
                    break;

                case 5:
                    System.out.println("ok tata tata bye bye");
                    break;

                default:
                    System.out.println("Please enter proper output");
            }

        }

    }

}
