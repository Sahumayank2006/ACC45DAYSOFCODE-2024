import java.util.*;
class ElectioninCheflands
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();// Input number of test Cases
		for(int i=1;i<=T;i++){
		    int XA=sc.nextInt();// Votes received by Party A
int XB=sc.nextInt();// Votes received by Party B
int XC=sc.nextInt();// Votes received by Party C
if (XA>=50 || XB>=50 || XC>=50){
    if (XA>XB && XA>XC && XA!=50)
    System.out.println("A");
else if (XB>XA && XB>XC && XB!=50)
    System.out.println("B");
else if (XC>XA && XC>XB && XC!=50)
    System.out.println("C");
 else 
    System.out.println("Nota");
   }
   else
   System.out.println("Nota");
		    
		}

	}
}
