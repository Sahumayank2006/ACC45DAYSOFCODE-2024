import java.util.*;
class BathinWinters
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int a=Y*2;
            System.out.println(X/a);
        }
    }
}
