import java.util.*;
class MaximisetheTastiness {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int sum=0;
            if(a>b){
            sum=sum+a;
            }
            else{
            sum=sum+b;
            }
             if(c>d){
            sum=sum+c;
             }
            else{
            sum=sum+d;
            }
            System.out.println(sum);
        }
    }
}
