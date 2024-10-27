import java.util.*;

class ChefandStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Read number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt(); // Read number of strings
            int[] strings = new int[N];
            
            // Read the sequence of strings
            for (int i = 0; i < N; i++) {
                strings[i] = scanner.nextInt();
            }
            
            long Skips = 0; 
            
            // Calculate total number of skipped strings
            for (int i = 0; i < N - 1; i++) {
                Skips += Math.abs(strings[i + 1] - strings[i]) - 1;
            }
            
            // Print the result for the current test case
            System.out.println(Skips);
        }
        
    }
}
