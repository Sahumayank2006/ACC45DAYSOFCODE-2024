import java.util.*;
class AorB{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();// Enter number of test Cases
        for(int i=1;i<=T;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int x=(500-(2*X))+(1000-(4*(X+Y)));
            int y=(1000-(4*Y))+(500-(2*(X+Y)));
            System.out.println(Math.max(x,y));
        }
    }
}
        


