import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();// Enter number of test Cases
	for(int i=1;i<=T;i++)
	{
	    int X=sc.nextInt();
	    if((X+3)<=10)//test condition
	    System.out.println("Yes");
	    else
	    	    System.out.println("No");
	}

	}
}
