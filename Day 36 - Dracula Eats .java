import java.util.Scanner;

class StickBreak {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); 
        for (int t = 0; t < T; t++) {
            int L = sc.nextInt(); 
            int K = sc.nextInt();
            
            
            if (L % K == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        
      
    }
}
