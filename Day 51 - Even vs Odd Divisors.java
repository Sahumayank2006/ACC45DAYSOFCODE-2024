import java.util.*;

class EvenvsOddDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) { // Use 't' instead of 'i' for test cases
            int N = sc.nextInt();
            int even = 0;
            int odd = 0;

            // Count divisors of N
            for (int i = 1; i <= N; i++) { // Use 'i' for counting divisors
                if (N % i == 0) { // Check if 'i' is a divisor of 'N'
                    if (i % 2 == 0) {
                        ++even;
                    } else {
                        ++odd;
                    }
                }
            }

            if (even > odd) {
                System.out.println("1");
            } else if (even == odd) {
                System.out.println("0");
            } else {
                System.out.println("-1");
            }
        }
        
    }
}
