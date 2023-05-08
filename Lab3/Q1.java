public class Q1{

    public static void main(String[] args) {
        
        printTables(8,9);

    }

    public static void printTables(int a , int b){

        int largestNumber  = 0;
        int smallestNumber = 0;

        if(a > b){
            largestNumber = a;
            smallestNumber = b;
        }
        else{
            largestNumber = b;
            smallestNumber = a;
        }

        for(int i = 1 ; i <= largestNumber ;i++){

            System.out.println(smallestNumber + " * " +  i + " = " + smallestNumber * i);
        }
    }
}