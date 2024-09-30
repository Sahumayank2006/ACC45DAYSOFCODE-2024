import java.util.*;
class ChefInHisOffice{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();// input number of test Cases
        for(int i=1;i<=T;i++){
            int X=sc.nextInt();//Working hours from Monday to Thursday
            int Y=sc.nextInt();//Working hours on friday
            System.out.println((X*4)+Y);
        }
    }
}
