public class Simple1 {

    public static void main(String[] args) {

        numberOddAndNotDivisibleBy3(21);

    }

    public static void numberOddAndNotDivisibleBy3(int n){

        if(n <= 0){
            return;
        }

        if(n % 2 == 0){
            System.out.println(" the given number is even ");
        }

        if(n % 2 != 0){
            if(n % 3 == 0){

                System.out.println("the given number is odd and divisible by 3 ");

            }
            else{

                System.out.println("the given number is odd and not divisible by 3 ");

            }
        }

    }
}

