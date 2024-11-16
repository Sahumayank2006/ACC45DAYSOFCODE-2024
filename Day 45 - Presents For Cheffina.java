import java.util.*;

class PresentsForCheffina {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Read the number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  
            int freeGifts = N / 5; 
            int coinsNeeded = N - freeGifts;  
            System.out.println(coinsNeeded);  
        }
 
    }
}
