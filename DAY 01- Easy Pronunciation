import java.util.*;

class EasyPronunciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            sc.nextLine(); 
            String S = sc.nextLine();
            int consonants = 0;
            boolean flag= false;
            
            for (int j = 0; j < N; j++) {
                char ch = S.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    consonants = 0; // Reset counter when a vowel is found
                } else {
                    consonants++; // Increment counter for a consonant
                    if (consonants >= 4) {
                        flag = true;
                        break;
                    }
                }
            }
            
            if (flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
