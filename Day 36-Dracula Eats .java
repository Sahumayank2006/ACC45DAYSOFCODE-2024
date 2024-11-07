import java.util.*;

class DraculaEats
{
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=1;i<=T;i++){
	    int N=sc.nextInt();
	   int c=0;
	   int a=2;
	   for(int j=1;j<=N;j++){
	       if(j==a){
	           ++c;
	           a=a+7;
	       }
	       
	    }
System.out.println(c);
	}

	}
}
