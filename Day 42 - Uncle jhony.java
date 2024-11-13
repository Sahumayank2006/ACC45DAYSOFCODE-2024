import java.util.*;

class Codechef
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        while (T-- > 0) {
            int N = sc.nextInt();  // Number of songs
            int[] songs = new int[N];
            
            for (int i = 0; i < N; i++) {
                songs[i] = sc.nextInt();  // Length of each song
            }
            
            int K = sc.nextInt();  // Position of "Uncle Johny"
            int uncleJohnyLength = songs[K - 1];  // Length of "Uncle Johny"
            
            Arrays.sort(songs);  // Sorting the song lengths
            
            // Find the new position of "Uncle Johny"
            int newPosition = 0;
            for (int i = 0; i < N; i++) {
                if (songs[i] == uncleJohnyLength) {
                    newPosition = i + 1;
                    break;
                }
            }
            
            System.out.println(newPosition);
        }
        sc.close();
    }
}
