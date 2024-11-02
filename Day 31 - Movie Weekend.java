import java.util.*;

class MovieWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int L[] = new int[n + 1];
            int R[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                L[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                R[i] = sc.nextInt();
            }
            
            int max = L[1] * R[1];
            int a = 1;
            
            for (int i = 2; i <= n; i++) {
                int currentProduct = L[i] * R[i];
                
                if (currentProduct > max) {
                    max = currentProduct;
                    a = i;
                } else if (currentProduct == max) {
                    if (R[i] > R[a]) {
                        a = i;
                    }
                }
            }
            
            System.out.println(a);
        }
    }
}
