public class Q17 {

    public static void main(String [] args){

        // uniqueStr("yashaswini");
        uniqueStr("JavaScript");

    }
    public static void uniqueStr(String str){


        int count = 1;
        int a = 0;
        String [] arr = new String[str.length()];

        for(int i = 0 ; i < str.length();i++){

            count = 0;

            for(int j = 0; j < str.length();j++){

                if(str.charAt(i)==(str.charAt(j))){
                    count ++;
                }

            }
            if(count <= 1){
                arr[a] = "" + str.charAt(i);
                a++;
            }

        }

        for(String x : arr){
            System.out.println(x);
        }

    }
    
}
