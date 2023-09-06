import java.util.Arrays;
import java.util.ArrayList;
import java.util.List; 
import java.util.Random;
import java.util.Scanner;
// class to create a multiplayer game
class Multiplayer{
	// variable to store the number of players
    int n;
    // 2D boolean array declaration to store whether two players
    // have met
    // Ex: n = 3 (player 0,1,2)
    // When player 0 meets player 2
    // met[0][2] = true and met[2][0] = true
    boolean met[][];
    // // int array declaration to store the number of players each
    // // player has met, player i wins if its value reaches n
    // // Ex: when n = 3 and count[0] = 3, count[1] = 2
    // //                    count[2] = 5 -> player 2 wins
    // int[] count;
    // constructor of Multiplayer class
    // initializes each array and value with 0 to start
    // a new game, plyrs is the number of players
    public Multiplayer(int plyrs){
    	// function to initialize the game with 0 values
    	clearMet(plyrs);
    }
    // function to initialize with zero values
    public void clearMet(int plyrs){
    	// store the number of players into n
    	n = plyrs;
    	// instantiate the class variable, met
    	met = new boolean[plyrs][plyrs];
    	// // instantiate the 
    	// count = new int[n];
    	// Iteratively set all the values of 2D array 'met' to false,
    	// except diagonal elements, 
    	// Ex: n = 3, met = [[true, false, false]
    	//                   [false, true, false]
    	//                   [false, false, true]]
    	// Row i represents the players with whom player i has met
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                met[i][j] = false;
                // set diagonal elements as true 
                if(i == j)
                	met[i][j] = true;
            }
        }
    }
    // method to set the value when two players meet
    public void meet(int i, int j){
        //when player i meets player j
        if (i != j) {
        	// set the value of 2D array to true
            met[i][j] = true;
            met[j][i] = true;
        }
    }
    // method to check if any player has won and return
    // the list of winners
    public List<Integer> isWin(){
    	// Instantiate a list object to store the winners
    	List<Integer> list = new ArrayList<>();
    	// check each row of array 'met' to see if any
    	// player has met all the players
    	// Ex: n = 3, met = [[true, false, true]
    	//                   [false, true, true]
    	//                   [true, true, true]]
    	// When i = 0, player 0 has met itself, and 2 but not 1
    	//      i = 1, player 1 has met itself, and 2 but not 0
    	//      i = 2, player 2 has met itself, 0 and 1
    	//            player 2 wins
    	// add 2 in list 
        for (int i = 0; i < n ; i++){
        	// variable to store how many players are met by player i
        	int num_mets = 0;
        	for (int j = 0; j < n; j++)
        		if(met[i][j])
        			num_mets++;
        	if(num_mets==n)
        		list.add(i);
        }
        // Return the list of winners
        return list;
    }
}
class prog3_23{
	// driver method
    public static void main(String[] args){
    	// create an object of class Random to run the game randomly
    	Random rand = new Random();
    	Scanner sc = new Scanner(System.in);
    	// Ask the user for the number of players
    	System.out.println("Enter the number of players");
    	int num = sc.nextInt();
    	// Create an object of class MultiplayerGame
    	// to initialize the game
        Multiplayer newGame = new Multiplayer(num);
        // Iteratively run the game randomly until atleast one
        // player has won the game
        while(newGame.isWin().size()==0){
        	// generate random numbers to make the players meet
        	// Ex: newGame(1,3), here 1 and 3 are randomly generated
        	newGame.meet(rand.nextInt(num), rand.nextInt(num));
        }
        // Print the players who have won the game
        System.out.println("Index of players who won the game : ");
        for(int i = 0; i < newGame.isWin().size(); i++)
        	System.out.println(newGame.isWin().get(i));
    }
}