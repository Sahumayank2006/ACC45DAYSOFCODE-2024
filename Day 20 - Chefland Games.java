import java.util.*;

class CheflandGames
{
	public static void main (String[] args) 
	{
		// Creating a Scanner object to read input
		Scanner sc = new Scanner(System.in);
		
		// Reading number of test cases
		int T = sc.nextInt();
		
		// Loop through each test case
		for (int t = 0; t < T; t++) {
		    // Read the decisions of the 4 referees
		    int R1 = sc.nextInt();
		    int R2 = sc.nextInt();
		    int R3 = sc.nextInt();
		    int R4 = sc.nextInt();
		    
		    // Check if all referees considered the ball inside (all should be 0)
		    if (R1 == 0 && R2 == 0 && R3 == 0 && R4 == 0) {
		        System.out.println("IN");
		    } else {
		        System.out.println("OUT");
		    }
		}
		
		
	}
}
