import java.util.*;
class BinaryBattles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            // Calculate number of rounds
            int k = (int) (Math.log(N) / Math.log(2));

            // Calculate total time
            int totalTime = k * A + (k - 1) * B;

            System.out.println(totalTime);
        }
    }
}
