import java.util.*;

class PrimalityTest
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int N=sc.nextInt();
		    int c=0;
		    for(int j=1;j<=N;++j){
		        if(N%j==0){
		            ++c;
		        }
		         }
		         if(c==2)
		         System.out.println("yes");
		         else
		         System.out.println("no");
		}

	}
}
