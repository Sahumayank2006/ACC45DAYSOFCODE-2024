import java.util.*;
class FillCandies
{
	public static void main (String[] args) 
	{
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();//input number of test Cases
for(int i=1;i<=T;i++){
    int N=sc.nextInt();//Candies received by Chef
    int K=sc.nextInt();//No. of pocket bag have
    int M=sc.nextInt();//No. of candies one pocket can hold
    int TotalSpace=M*K;//total candies kept in one bag
if (N <= TotalSpace)
                System.out.println(1);
else  if((N%TotalSpace)==0)
        System.out.println(N/TotalSpace);
        else
        System.out.println((N/TotalSpace)+1);
    
}

	}
}
