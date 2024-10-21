import java.util.*;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] count = new int[N + 1]; // Array to store the count of each preferred group size
            
            for (int j = 0; j < N; j++) {
                int groupSizePreference = sc.nextInt();
                count[groupSizePreference]++;
            }
            
            boolean happy = true;
            for (int j = 2; j <= N; j++) {
                if (count[j] % j != 0) {
                    happy = false;
                    break;
                }
            }
            
            System.out.println(happy ? "YES" : "NO");
        }
        
    }
}
