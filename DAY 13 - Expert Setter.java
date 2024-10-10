import java.util.*;
class EXpertSetter{
    public static void main(String[] args_){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();//Enter Number of test cases
        for(int i=1;i<=T;i++){
            int X=sc.nextInt();//Problems Submitted to Chef
            int Y=sc.nextInt();// Problems approved by Chef
            if(Y>=(X*0.5))//Conditions
            System.out.println("YES");
            else
    System.out.println("NO");
            
        }
    }
}
