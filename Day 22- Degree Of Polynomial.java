import java.util.*;
class DegreeOfPolynomial
{
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=1;i<=T;i++){
	    int N=sc.nextInt();
	    int arr[]=new int[N];
	    for(int j=0;j<N;j++){
	        arr[j]=sc.nextInt();
	        }
    for(int k=N-1;k>=0;k--){
        if(arr[k]!=0){
            System.out.println(k);
            break;
        }
    }


	}
	

	}
}
