import java.util.*;

class Weights
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();// Enter number of test Cases
		for(int i=1;i<=T;i++){
		    int W=sc.nextInt();
int X=sc.nextInt();
int Y=sc.nextInt();
int Z=sc.nextInt();
if(W==X || W==Y ||W==Z || W==(X+Y)|| W==(Z+Y)||W==(X+Z)||W==(Z+X+Y))
System.out.println("YES");
else
System.out.println("NO");
		    
		}

	}
}
