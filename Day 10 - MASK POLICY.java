import java.util.*;

class Maskpolicy
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();// Enter number of test cases
		for(int i=1;i<=T;i++){
		    int N=sc.nextInt();// total number of people 
		    int A=sc.nextInt();// total infected people 
		 // various test conditions to check how many should wear mask 
      if(A==1 || (N-A)==A ||(N-A>A))
		  System.out.println(A);
	else if((N-A)< A)
	System.out.println(N-A);
	else if ((N-A)>1)
		  System.out.println(N-A-1);
		   else 
		    System.out.println(N-A);
		}

	}
}
