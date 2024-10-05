import java.util.*;
class MONOPOLY
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//ENTER NUMBER OF TEST CASES
		for(int i=1;i<=T;i++){
		    int P=sc.nextInt();//Profit made by company P (in lakhs)
		    int Q=sc.nextInt();//Profit made by company Q(in lakhs)
		    int R=sc.nextInt();//Profit made by company R(in lakhs)
		    int S=sc.nextInt();//Profit made by company S(in lakhs)
		    if(P>(Q+R+S) ||Q>(P+R+S) ||R>(Q+P+S) ||S>(Q+R+P) )
		    System.out.println("YES");
		    else
		      System.out.println("NO");
		}

	}
}
