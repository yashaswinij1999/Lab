public class Question2 {

    public static void main(String[] args) {

        int num = 12500;

        System.out.println("the number : " + num + " in words = " + numberToWordConversation(num));

    }

    public static String numberToWordConversation(int num) {

        String word = "";

        String[] unitTens = { "zero", " one ", " two ", " three ", " four ", " five ", " six ", " seven ", " eight ",
                " nine ", " ten ",
                " eleven ", " tweleve ", " thirdteen ", " fourteen ", " fifteen ", " sixteen ", " seventen ",
                " eighteen ",
                " nineteen " };

        String[] tens = { "zero", " ten ", " twenty ", " thirty ", " fourty ", " fifty ", " sixty ", " seventy ",
                " eighty ", " ninty " };

        if (num == 0) {
            return "zero";
        }

        if (num < 0) {
            String str = "" + num;
            str = str.substring(1);
            return numberToWordConversation(Integer.parseInt(str));
        }

        if ((num / 100000000) > 0) {

            word = word + "" + (numberToWordConversation(num / 100000000) + " crore ");
            num = num % 100000000;

        }

        if ((num / 100000) > 0) {

            word = word + "" + (numberToWordConversation(num / 100000) + " lakh ");
            num = num % 100000;

        }

        if ((num / 1000) > 0) {

            word = word + " " + (numberToWordConversation(num / 1000) + " thousand ");
            num = num % 1000;

        }

        if ((num / 100) > 0) {

            word = word + " " + (numberToWordConversation(num / 100) + " hundread ");
            num = num % 100;

        }

        if (num > 0) {

            if (num < 20) {

                word = word + unitTens[num];

            } else {

                word = word + tens[num / 10];

                if ((num / 10) > 0) {
                    word = word + "-" + unitTens[num % 10];
                }

            }

        }
        return word;
    }

}
