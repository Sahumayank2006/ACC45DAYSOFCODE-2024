// creating a Simple Calculator all input will be done by user 
import java.util.*;
class Calculator
{
    public static void main(String[] args)
    {
        
        int answer=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter a operation : + for addition , - for subtraction , * for multiplication , / for quotient, % for remainder.");
        char ch = sc.next(".").charAt(0);
        if(ch=='+'){
            answer=a+b; 
        } 
        else if(ch=='-'){
            answer=a-b; 
        } else if(ch=='*'){
            answer=a*b; 
        } else if(ch=='/'){
            answer=a/b; 
        } else if(ch=='%'){
            answer=a%b; 
        }  else {
            System.out.println("INVALID OPERATION ENTERED BY USER.");
        }
    System.out.println("YOUR INPUT : "+a+ch+b);
    System.out.println("Answer = "+answer);
    }
} 


