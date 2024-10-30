import java.util.*;

class ReachFast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int K = sc.nextInt();

            // Calculate the absolute distance between A and B
            int distance = Math.abs(B - A);

            // Calculate the minimum number of steps required
            int steps = (distance + K - 1) / K;

            System.out.println(steps);
        }

    
    }
}
