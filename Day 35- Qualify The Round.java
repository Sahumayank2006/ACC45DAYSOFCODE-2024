import java.util.*;
class QualifyTheRound
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i =1;i<=T;i++){
		    int X=sc.nextInt();
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    if(X<=(A*1+B*2))
		    System.out.println("Qualify");
		    else
		    System.out.println("NotQualify ");
		    
		}

	}
}
