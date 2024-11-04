import java.util.*;
class GoodProgram
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T= sc.nextInt();
		for(int i=0;i<T;i++){
		    int N= sc.nextInt();
		    if(N%4==0)
		    System.out.println("GOOD");
		    else
		    System.out.println("NOT GOOD");
		}

	}
}
