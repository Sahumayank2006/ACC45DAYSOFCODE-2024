// Medium category question - AIRLINE RESTRICTION.
import java.util.*;
class amitycodingchallenge
{
	public static void main (String[] args) 	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();// input number of test cases
	for(int i=1;i<=T;i++){
	    int A=sc.nextInt();//first bag weight carry by passenger
	    int B=sc.nextInt();//second bag weight carry by passenger
	    int C=sc.nextInt();//third bag weight carry by passenger
	    int D=sc.nextInt();//maximum bags weight for check-in(could by any 2 bag )
	    int E=sc.nextInt();//maximum bag weight that carry by passenger(could by any bag )
	    if(A+B <=D && C<=E){
	        System.out.println("YES");
	    }
	    else if(A+C <=D && B<=E)
	    {
	         System.out.println("YES");
	    } else if(B+C <=D && A<=E)
	    {
	         System.out.println("YES");
	    }
	     else 
	    {
	         System.out.println("NO");
	    }
	}
	}
}
/*
YES denotes person can succesfully proceed for check in as bag carried by person succesfully comply with limit of airline.
NO denotes person cannot  proceed for check in as bag carried by person notcomply with limit of airline/bag weight too much...
PROGRAM DESCRIPTION- 
A PERSON HAS 3 BAG WEIGH A,B,C kg IN WHICH OUT OF 3 BAG
1.ONLY 2 BAG CAN CHECK IN WHICH THERE WEIGHT MUST NOT EXCEED D kg (2 BAG CAN WE ANY OF FOLLOWING OUT OF 3)
2. AND REMAINING ONE BAG CAN CARRY BY PERSON WHICH NOT EXCEED E kg .(COULD BE ANY OF BAG OUT OF 3)
NOTE - USE OF 3 IF CONDITION IS TO AVOID ANY COMBINATION OF BAG.
*/
