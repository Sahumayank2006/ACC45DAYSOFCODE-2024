import java.util.*;

class RecentContestProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) { // Use 0-based indexing for loops
            int N = sc.nextInt();
            int L = 0;
            int S = 0;
            
            for (int j = 0; j < N; j++) { // Use 0-based indexing for loops
                String s = sc.next(); // Use next() instead of nextLine()
                
                if (s.equals("LTIME108")) {
                    ++L;
                }
                
                if (s.equals("START38")) {
                    ++S;
                }
            }
            
            System.out.println(S + " " + L);
        }
        
        sc.close(); // Always close the scanner after use to free resources
    }
}
