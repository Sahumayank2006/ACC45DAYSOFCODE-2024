import java.util.*;
class ChefFantasy11
{
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();//input number of test Cases
	for(int i=0;i<T;i++){
	    int N=sc.nextInt();// No. of player
	    if(N==2)
	    System.out.println(N);//only captain and vice captain
	    else
	    System.out.println((N)*(N-1));// possibilty of choosing the captain and vice captain
	}

	}
}
