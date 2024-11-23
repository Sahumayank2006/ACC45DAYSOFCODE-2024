import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {  // changed loop condition to for(int i=0; i<T; i++) for consistency
            int N = sc.nextInt();
            int s[] = new int[N];
            for (int j = 0; j < N; j++) {
                s[j] = sc.nextInt();
            }
            String V = sc.next();
            int small = 101; // Initialize with a value larger than any possible size (1 to 100)
            for (int k = 0; k < N; k++) {
                if (V.charAt(k) == '0') { // Use '0' as a character
                    if (s[k] < small) {
                        small = s[k];
                    }
                }
            }
            System.out.println(small);
        }
    }
}
