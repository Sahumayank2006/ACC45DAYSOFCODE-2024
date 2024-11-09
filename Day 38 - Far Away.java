import java.util.*;

class FarAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            long maxDistance = 0; // Use long to avoid integer overflow
            for (int i = 0; i < N; i++) {
                int Ai = sc.nextInt();
                // Calculate the maximum distance for each A_i
                int distanceWith1 = Math.abs(Ai - 1);
                int distanceWithM = Math.abs(Ai - M);
                maxDistance += Math.max(distanceWith1, distanceWithM);
            }
            System.out.println(maxDistance);
        }
        
        sc.close();
    }
}
