import java.util.*;
class CyclicQuadrilateral
{
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=0;i<T;i++){
	    int A=sc.nextInt();
	    int B=sc.nextInt();
	    int C=sc.nextInt();
	    int D=sc.nextInt();
	    if((A+C)==180 && (B+D)==180)
	    System.out.println("YES");
	    else
	     System.out.println("No");
	}
	}
}
