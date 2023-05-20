import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        CountryandCapitals c1 = new CountryandCapitals();
        Scanner sc = new Scanner(System.in);
        int ch = 0;

        while (ch != 4) {
            System.out.println("Press 1 to add channel ");
            System.out.println("Press 2 to search capital given country name ");
            System.out.println("Press 3 to get all details ");
            System.out.println("Press 4 to exit ");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            System.err.println("choice entered = " + ch);

            switch (ch) {

                case 1:
                    System.out.println("Enter country name");
                    String country = sc.next();

                    System.out.println("Enter capital name");
                    String capital = sc.next();

                    c1.add(country, capital);
                    break;

                case 2:
                    System.out.println("Enter country name");
                    String name = sc.next();
                    System.out.println(c1.getCapital(name));
                    break;

                case 3:
                    String[] details = c1.getAllDetails();

                    for (String s : details) {
                        System.out.println(s);
                    }
                    break;

                default:
                    System.out.println("Enter proper input");
                    break;

                case 4:
                    System.out.println("ok tata bye bye");

            }

        }
    }

}
