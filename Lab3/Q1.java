import java.util.Scanner;

public class Q1{

    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println( "Enter the first name ");
        System.out.println(" ---------------------------------------------- ");
        String name = sc1.next();
        System.out.println(" ---------------------------------------------- ");

        System.out.println( " Enter your age ");
        System.out.println(" ---------------------------------------------- ");
        Integer age = sc1.nextInt();
        System.out.println(" ---------------------------------------------- ");

        System.out.println(" ---------------------------------------------- ");
        System.out.println( " Enter a sentence ");
        String sentence = sc2.nextLine();
        System.out.println(" ---------------------------------------------- ");

        System.out.println( "sentence = "+ sentence);






    }
}