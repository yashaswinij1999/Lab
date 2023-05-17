import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = sc1.next();

        System.out.println("Enter age");
        int age = sc1.nextInt();

        String story = "name : " + name + "," + "age =" + age;
        System.out.println("story : " + story);

    }
}