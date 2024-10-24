import java.util.*;

class Bi_lindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases
        while (T-- > 0) {
            int N = sc.nextInt(); // Read the length of the string
            String S = sc.next(); // Read the string
            System.out.println(maxDeletableSubsequence(S, N));
        }
    }
    
    public static int maxDeletableSubsequence(String S, int N) {
        // Use a frequency array to count occurrences of each character
        int[] freq = new int[26];
        
        for (int i = 0; i < N; i++) {
            freq[S.charAt(i) - 'a']++;
        }
        
        // Check if there's any character with a frequency greater than 1
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                return N - 2; // Maximum deletable subsequence length
            }
        }
        
        return -1; // Not possible to form a palindrome of length > 1
    }
}
