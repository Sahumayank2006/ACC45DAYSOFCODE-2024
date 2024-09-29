import java.util.*;
class TcsExamination{
    public static void main(String[] args){
        int DSA1,TOC1,DM1;//marks of DRAGON
        int DSA2,TOC2,DM2;//marks of Sloth
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();//input number of test Cases
        for(int i=1;i<=T;i++){
        DSA1=sc.nextInt();// input mark of DRAGON
        TOC1=sc.nextInt();// input mark of DRAGON
        DM1=sc.nextInt();//input mark of DRAGON
        int sum1=DSA1+TOC1+DM1;//total marks of DRAGON
        DSA2=sc.nextInt();// input mark of SLOTH
        TOC2=sc.nextInt();// input mark of SLOTH
        DM2=sc.nextInt();// input mark of SLOTH
        int sum2=DSA2+TOC2+DM2;//total marks of SLOTH
        //test condition for getting better rank
          if (sum1>sum2)
        System.out.println("DRAGON");
        else if (sum1<sum2)
        System.out.println("SLOTH");
        else // total marks are equal
        {
            //checking subjectwise marks for better RANK
          if(DSA1>DSA2)
                System.out.println("DRAGON");
            else if(DSA1<DSA2)
            System.out.println("SLOTH");
            else {
                 if(TOC1>TOC2)
                System.out.println("DRAGON");
            else if(TOC1<TOC2)
            System.out.println("SLOTH");
            else{
                if(DM1>DM2)
                System.out.println("DRAGON");
                else if(DM1<DM2)
                System.out.println("SLOTH");
                else
                System.out.println("TIE");
                
            }
            }
             }
}
}
}
