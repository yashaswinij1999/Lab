public class Q7 {

    public static void main(String[] args) {
        
        String [] colors = {"black" , "brown" ,"yellow" ,"white","red"};

        for(int i = 0; i < colors.length ;i++){

            int a = (int)(Math.random() * colors.length);
            System.out.println(colors[a]);
        }

    }
    
}
