import java.util.*;

class PassOrFail
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int P = sc.nextInt();
            int sum = X * 3 - (N - X);
            if(sum >= P)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
    }
}
