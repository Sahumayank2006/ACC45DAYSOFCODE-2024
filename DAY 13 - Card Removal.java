import java.util.*;

class CardRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            int[] frequency = new int[11]; // Array to count frequency of numbers 1 to 10
            for (int i = 0; i < N; i++) {
                frequency[a[i]]++;
            }

            int maxFrequency = 0;
            for (int i = 1; i <= 10; i++) {
                if (frequency[i] > maxFrequency) {
                    maxFrequency = frequency[i];
                }
            }

            int minRemovals = N - maxFrequency;
            System.out.println(minRemovals);
        }
        
    }
}
