import java.util.*;
class MinimumNumberOfFlips {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = sc.nextInt(); // Length of array
            int[] A = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];  // Calculate the sum of the array
            }
            
            if (N % 2 != 0) {
                // If N is odd, we cannot make the sum 0
                System.out.println(-1);
            } else {
                // Calculate the number of 1s and -1s
                int count1 = (sum + N) / 2;
                int countMinus1 = N - count1;

                // We need to balance the number of 1s and -1s
                int operationsNeeded = Math.abs(count1 - countMinus1) / 2;
                System.out.println(operationsNeeded);
            }
        }
      
    }
}
