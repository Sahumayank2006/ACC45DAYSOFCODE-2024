import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int B[] = new int[N];
            for(int j = 0; j < N; j++) {
                B[j] = sc.nextInt();
            }
            
            // Assume the first element of A is 1 (or any arbitrary choice)
            int A[] = new int[N];
            A[0] = 1;
            
            for(int k = 1; k < N; k++) {
                if (B[k - 1] == 0) {
                    A[k] = A[k - 1];
                } else {
                    A[k] = A[k - 1] + 1;
                }
            }
            
            // Check the condition for the last element
            if ((A[0] + A[N - 1]) % 2 == B[N - 1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
      
    }
}
