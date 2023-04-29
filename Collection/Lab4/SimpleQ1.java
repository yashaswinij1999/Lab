public class SimpleQ1 {

    public static void main(String[] args) {

        String s = "johny johny yes pa pa eating sugar no pa pa";
        String[] split = s.split(" ");
        String word = "pa";

        int count = 0;
        for (String s1 : split) {

            if (s1.equals(word))
                count++;
        }
        System.out.println(" the word " + word  + " occurs " + count + " times ");

    }
}