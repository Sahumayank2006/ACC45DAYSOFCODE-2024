import java.util.*;
class carOrBike
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X==Y){
                System.out.println("SAME");
            }
            else if (X>Y)
            System.out.println("CAR");
            else
            System.out.println("BIKE");
            
        }
    }
}
