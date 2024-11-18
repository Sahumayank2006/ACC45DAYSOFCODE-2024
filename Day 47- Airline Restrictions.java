import java.util.*;
class AirlineRestrictions
{
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=1;i<=T;i++){
	   int A=sc.nextInt();
	   int B=sc.nextInt();
	   int C=sc.nextInt();
	   int D=sc.nextInt();
	   int E=sc.nextInt();
	   if(A+B<=D && C<=E) 
	   System.out.println("YES");
	   else if(A+C<=D && B<=E) 
	   System.out.println("YES"); 
	   else if(C+B<=D && A<=E) 
	   System.out.println("YES");
	   else
	   System.out.println("NO");
	}
	}
}
