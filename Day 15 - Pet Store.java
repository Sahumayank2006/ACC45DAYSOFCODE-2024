import java.util.*;

class PetStore
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//number of test Cases
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] animals = new int[N];
            for (int i = 0; i < N; i++) {
                animals[i] = sc.nextInt();
            }
            
            // Frequency array for counting occurrences of each type
            int[] frequency = new int[101]; // Since 1 <= A_i <= 100
            for (int i = 0; i < N; i++) {
                frequency[animals[i]]++;
            }
            
            // Check if all frequencies are even
            boolean possible = true;
            for (int i = 1; i <= 100; i++) {
                if (frequency[i] % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
       
    }
}
