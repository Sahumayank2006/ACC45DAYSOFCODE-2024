import java.util.*;
class Main {
public static void main(String[]
args) {
Scanner sc= new Scanner
(System.in);
int T=sc.nextInt();
for (int i=0;i<T;i++){
int A =sc.nextInt();
int B =sc.nextInt(); 
int C=sc.nextInt();
 if (A<=B && A<=C)
System.out.println(B+C); 
else if (B<=C && B<=A)
System.out.println(C+A);
else
System.out.println(A+B);
}
}
}
