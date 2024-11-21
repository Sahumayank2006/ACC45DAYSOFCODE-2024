import java.util.*;

class FindMissingDoll
{
    public static void main (String[] args) 
    {
       
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        
        while (T-- > 0) {
            int N = sc.nextInt();  // Number of dolls
            int ans = 0;
            
            // Reading doll types and using XOR to find the unpaired doll
            for (int i = 0; i < N; i++) {
                int type = sc.nextInt();
                ans ^= type;
            }
            
            // Output the result
            System.out.println(ans);
        }
        
        
    }
}
