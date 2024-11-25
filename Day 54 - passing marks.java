import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Sort the scores in ascending order
            Arrays.sort(a);
            
            // The passing mark can be at most the (N-X)-th score
            // because X students should have scores greater than the passing mark
            int passingMark = a[n - x] - 1;
            
            // Print the result for this test case
            System.out.println(passingMark);
        }
    }
}
