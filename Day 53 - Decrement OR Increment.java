

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
            int N=s.nextInt();
            if(N%4==0)
            {
              System.out.println(N+1);  
            }
            else
            {
            System.out.println(N-1);
            }
        		
	}
}
