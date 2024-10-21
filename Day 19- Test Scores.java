import java.util.*;
class TestScore
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            int N=sc.nextInt();
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(Y%X==0 || Y==0)
            {
  System.out.println("YES");
            
        }
        else 
        System.out.println("NO");
    }
}
}
