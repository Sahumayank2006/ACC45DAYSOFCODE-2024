import java.util.*;

class CountTheNotebooks
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//input number of test Cases
		for(int i=1;i<=T;i++){
		    int N=sc.nextInt();
		    System.out.println((1000*N)/100);
		}

	}
}
