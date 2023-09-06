import java.util.Scanner;

public class NumberToWordExample1 {

    public static String numbertoWordsConverter(int number) {

        String word = "";
        String unit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven",
                "twelve", "thirdteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighten", "ninteen" };

        String tens[] = { "zero", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

        if (number == 0) {
            return "zero";
        }

        if (number < 0) {

            String s = "" + number;
            s = s.substring(1);
            return " minus " + numbertoWordsConverter(Integer.parseInt(s));

        }

        if ((number / 10000000) > 0) {

            word = word + numbertoWordsConverter(number / 10000000) + " crore ";
            number = number % 10000000;
        }
        if ((number / 100000) > 0) {

            word = word + numbertoWordsConverter(number / 100000) + " lakhs ";
            number = number % 100000;
        }
        if ((number / 1000) > 0) {

            word = word + numbertoWordsConverter(number / 1000) + " thousand ";
            number = number % 1000;
        }
        if ((number / 100) > 0) {

            word = word + numbertoWordsConverter(number / 100) + " hundread ";
            number = number % 100;
        }

        if (number > 0) {

            if (number < 20) {

                word = word + unit[number];

            } else {

                word = word + tens[number / 10];

                if ((number % 10) > 0) {
                    word = word + " - " + unit[number % 10];
                }
            }
        }
        return word;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("number  = " + " Zero ");
        } else {
            System.out.println(numbertoWordsConverter(number));
        }
    }

}