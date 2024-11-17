import java.util.*;
class EndlessAppetizers 
{
	public static void main (String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     int T=sc.nextInt();
     for(int i=1;i<=T;i++){
         int X=sc.nextInt();
         int Y=sc.nextInt();
         int R=sc.nextInt();
         int extra=R/30;
         int total=X+extra;
         if(total%Y==0)
         System.out.println(total/Y);
         else
         System.out.println((total/Y)+1);
     }

	}
}
