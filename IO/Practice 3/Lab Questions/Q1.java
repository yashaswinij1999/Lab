
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc1.next();

        System.out.println("Enter you address");
        String address = sc2.nextLine();

        System.out.println(name + " is married ");
        boolean isMarried = sc1.nextBoolean();

        System.out.println("name : " + name + " is married : " + isMarried + " address : " + address);

    }

}
