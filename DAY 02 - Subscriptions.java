import java.util.*;
class Subscriptions
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//input number of Test Cases
		for(int i=1;i<=T;i++){
		int N=sc.nextInt();//input number of friends
		int X=sc.nextInt();//input cost of one Subscription
		if(N/6 ==0)//number of friend less than 6 
		System.out.println(X);
		if(N/6 > 0 && N%6 == 0)//number of friend equal to multiple of 6
		System.out.println((N/6)*X);
		if(N/6 > 0 && N%6 != 0)//number of friend not equal to multiple of 6
		System.out.println(((N/6)+1)*X);
		}
		

	}
}
