public class Q7 {

    public static void main(String[] args) {
        
        System.out.println(uniqueCodeDilimiter("abd"));
    }
    
    public static String uniqueCodeDilimiter(String str){

        String s = "";
        
        for(int i = 0 ; i < str.length() ;i ++){

            int x = str.charAt(i);
            s += "." + x;
        }
        return s;

    }
}
