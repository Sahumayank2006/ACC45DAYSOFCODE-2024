import java.util.*;

class DraculaEats {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // Read the number of test cases
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // Read the number of spooky days for each test case
            // Calculate the number of Tuesdays
            int tuesdays = (N + 5) / 7; // (N - 1 + 6) / 7 is simplified to (N + 5) / 7
            System.out.println(tuesdays);
        }
        
        sc.close(); // Close the scanner
    }
}
