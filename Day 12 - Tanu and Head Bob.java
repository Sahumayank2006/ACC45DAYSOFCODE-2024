import java.util.*;
class TanuandHeadbob
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();  // number of people observed
		for (int t = 0; t < T; t++) {
			int N = scanner.nextInt();  // number of gestures for this person
			String gestures = scanner.next();  // the string of gestures
			
			// Determine the type of person based on gestures
			if (gestures.contains("I")) {
				System.out.println("INDIAN");
			} else if (gestures.contains("Y")) {
				System.out.println("NOT INDIAN");
			} else {
				System.out.println("NOT SURE");
			}
		}
		
	
	}
}
