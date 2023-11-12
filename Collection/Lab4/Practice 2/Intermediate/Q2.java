public class Q2 {

    public static void main(String[] args) {

        System.out.println(numberToWordConverter(10000));

    }

    public static String numberToWordConverter(int number) {

        String word = "";

        String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "elevan", "tweleve", "thirdteen", "fourteen", "fivteen", "sixteen", "seventeen", "eighteen",
                "ninteen" };

        String[] tens = { "zero", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            String str = " " + number;
            str = str.substring(1);
            return "minus" + numberToWordConverter(Integer.parseInt(str));

        }

        if ((number / 100000000) > 0) {
            word = word + (numberToWordConverter(number / 100000000) + " crore ");
            number = number % 100000000;
        }

        if ((number / 100000) > 0) {
            word = word + (numberToWordConverter(number / 100000) + " lakh ");
            number = number % 100000;
        }

        if ((number / 1000) > 0) {
            word = word + (numberToWordConverter(number / 1000) + " Thousand ");
            number = number % 1000;
        }

        if ((number / 100) > 0) {
            word = word + (numberToWordConverter(number / 100) + " hundread and ");
            number = number % 100;
        }

        if (number > 0) {

            if (number < 20) {
                word = word + units[number];

            } else {

                word = word + tens[number / 10];

                if ((number % 10) > 0) {
                    word = word + " - " + units[number % 10];
                }
            }
        }
        return word;

    }

}
