public class Q11 {

    public static void main(String[] args) {
        
        isPalindrome(123);
    }
    
    public static void isPalindrome(int n){

        int temp = 0;
        int r = 0;
        int original  = n;

        while(n > 0){
          r = n % 10;
          temp = (temp * 10 )+ r  ;
          n  /= 10;
        }

        if(temp == original){
            System.out.println("the given number is palindrome ");
        }
        else{
            System.out.println("the given number is not palindrome ");
        }
    }
}
