import java.util.*;

class TheLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // number of rounds
        int maxLead = 0;
        int winner = 0;
        
        int cumulativeScore1 = 0;
        int cumulativeScore2 = 0;
        
        for (int i = 0; i < N; i++) {
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            
            cumulativeScore1 += score1;
            cumulativeScore2 += score2;
            
            int currentLead = Math.abs(cumulativeScore1 - cumulativeScore2);
            int currentLeader = (cumulativeScore1 > cumulativeScore2) ? 1 : 2;

            if (currentLead > maxLead) {
                maxLead = currentLead;
                winner = currentLeader;
            }
        }
        
        System.out.println(winner + " " + maxLead);
    }
}
