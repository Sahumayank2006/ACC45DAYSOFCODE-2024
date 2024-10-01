import java.util.*;
class TheThreeTopics {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int A=sc.nextInt();//Enter first topic
        int B=sc.nextInt();//Enter Second Topic
int C=sc.nextInt();//Enter third topic
int X=sc.nextInt();//Enter topic prepared by chef
if(X==A || X==B || X==C)// testing topics match or not
System.out.println("Yes");// Chef prepared that topics enter by User
else
System.out.println("No");
        
        
    }
}
