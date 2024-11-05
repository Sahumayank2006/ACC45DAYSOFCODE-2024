import java.util.*;
class Blackjack {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = 21 - (a + b);
            
            if (c >= 1 && c <= 10) {
                System.out.println(c);
            } else {
                System.out.println(-1);
            }
        }
        
        
    }
}
