import java.util.*;

class BAalancedReversals
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // Number of test cases
		while (T-- > 0) {
			int N = sc.nextInt(); // Length of the binary string
			String A = sc.next(); // The binary string itself
			
			// Convert the string to a character array
			char[] charArray = A.toCharArray();
			// Sort the character array
			Arrays.sort(charArray);
			// Convert the sorted array back to a string
			String result = new String(charArray);
			
			// Print the result for the current test case
			System.out.println(result);
		}
		
	}
}
