import java.math.BigDecimal;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter you first name");

        System.out.println("------------------------------------------------");

        String name = sc1.next();

        System.out.println("------------------------------------------------");

        System.out.println(" Enter your age ");

        System.out.println("------------------------------------------------");

        Integer age = sc1.nextInt();

        System.out.println("------------------------------------------------");

        System.out.println("no of cells in your body");

        System.out.println("------------------------------------------------");

        BigDecimal bd = sc1.nextBigDecimal();

        System.out.println("------------------------------------------------");

        System.out.println(" current amount in your pursue ");

        System.out.println("------------------------------------------------");

        double amt = sc1.nextDouble();

        System.out.println("------------------------------------------------");

        System.out.println("write your story ");

        System.out.println("------------------------------------------------");

        String story = sc2.nextLine();

        System.out.println(
                "first name " + name + " age " + age + " cells = " + bd + " amt in pursue = " + amt);

    }
}