public class Q5 {

    public static void main(String[] args) {
        

        String word = "mogambo";

        int [] arr = new int [26];
        
        for(int i= 0; i < word.length() ;i ++){

            char c = word.charAt(i);

            arr[c - 'a']++;


        }

        for(int i = 0 ; i < arr.length ;i ++){

            System.out.println( (char) ('a' + i) + " occurs " + arr[i] );
        }


    }
    
}
