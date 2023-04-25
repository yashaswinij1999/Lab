public class Q6 {

    public static void main(String[] args) {

        String str = "and and is is the ";

        String[] words = str.split(" ");

        int count = 0;

        String[] arr = new String[words.length];

        int pos = 0;

        for (String s1 : words) {

            count = 0;

            for (String s2 : words) {

                if (s1.equals(s2))
                    count++;

            }
            if (count == 1) {

                arr[pos++] = s1;

            }
        }
        for(String s : arr){

            System.out.println(s);
            
        }

    }

}
