import java.util.*;

class MutatedMinions {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Number of minions
            int K = sc.nextInt(); // Value added by the transmogrifier
            int count = 0; // Counter for Wolverine-like minions
            for (int i = 0; i < N; i++) {
                int characteristic = sc.nextInt(); // Initial characteristic value
                if ((characteristic + K) % 7 == 0) { // Check divisibility by 7
                    count++;
                }
            }
            System.out.println(count); // Output the result for the current test case
        }
       
    }
}
