public class Question4 {

    public static void main(String[] args) {
        
        printTables(9,10);

    }
    public static void printTables(int a , int b){

        int largestNumber;
        int smallestNumber;

        if(a > b){
            largestNumber = a;
            smallestNumber = b;
        }
        else{
            largestNumber = b;
            smallestNumber = a;
        }

        for(int i = 1 ; i <= largestNumber ;i++){

            System.out.println(smallestNumber + " * " + i + " = " + smallestNumber * i );
        }
    }
    
}
