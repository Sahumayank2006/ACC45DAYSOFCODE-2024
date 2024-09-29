import java.util.*;
class mayank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int nums[]=new int[50];//array input by user
        int expectednums[]=new int[50];//new array after deleting duplicate entries from array
        System.out.println("Enter array length :");
        int length=sc.nextInt();
        System.out.println("Enter array element in a sorted way :");
        for(int i=0;i<length;i++){
            nums[i]=sc.nextInt();
        }
        LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
 
        // adding elements to LinkedHashSet
        for (int i = 0; i < nums.length; i++)
           
           if(nums[i]!=0)// Condition to add only non zero element in array
           {
            set.add(nums[i]);
 
           }
           else if(i==0 && nums[i]==0)// condition to add if there is 0 element in first place in user input array
           {
               set.add(nums[i]);
           }
           
          int k=set.size();//to calculate size of new array
           System.out.print(k+", nums =  ");
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
}
