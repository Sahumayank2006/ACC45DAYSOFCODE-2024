import java.util.*;
class WaterFilling
{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();// Enter number of test cases
	    for(int i=1;i<=T;i++){
	    int B1=sc.nextInt();
int B2=sc.nextInt();
int B3=sc.nextInt();
if (B1==0 && B2==0 || B1==0 && B3==0 || B2==0 && B3==0)
    System.out.println("Water filling time");
    else
    System.out.println("Not now");


	    }
	}
}
