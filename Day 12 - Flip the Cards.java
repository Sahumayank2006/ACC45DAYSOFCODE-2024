import java.util.*;
class FliptheCards
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // Read the number of test cases
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // Total number of cards
			int X = sc.nextInt(); // Number of cards face-up
			
			// Calculate minimum flips required
			int faceDownCards = N - X; // Cards that are face-down
			int minFlips = Math.min(X, faceDownCards);
			
			System.out.println(minFlips);
		}
		
		
	}
}
