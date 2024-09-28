import java.util.*;
class TwoSum{
    public static void main(String[]args){
        int num[]=new int[10000];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array :");//input length of array
        int length=sc.nextInt();
        System.out.println("Enter element of Array :");//input element of array
        for(int i=0;i<length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter Target Number :");//enter target number
        int Target=sc.nextInt();
        for(int j=0;j<length-1;j++)//condition to check sum of indices of array equivalent to target number
        {
            for(int k=j+1;k<length;k++)//condition to check sum of indices of array equivalent to target number
            {
                if(num[j]+num[k] == Target)
                {
                    System.out.println("Output- ["+j+","+k+"]");
                }
            }
        }

    }
}
