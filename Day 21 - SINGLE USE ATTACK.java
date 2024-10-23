import java.util.*;

class SingleUseAttack {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {  // Change to i < T
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            H -= Y; // Apply special attack
            int k = 1; // Start the count with 1 for the special attack

            while (H > 0) { // Change to H > 0
                ++k;
                H -= X;
            }
            System.out.println(k);
        }
        
    }
}
