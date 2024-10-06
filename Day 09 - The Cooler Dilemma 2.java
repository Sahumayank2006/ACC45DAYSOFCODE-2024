import java.util.Scanner;

class  TheCoolerDilemma2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();// enter number of test cases
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();// amount of rent a cooler monthly 
            int Y = sc.nextInt();// amount required to purchase a cooler
            int a = (Y - 1) / X; // Calculate maximum months
            System.out.println(a);
        }
        
    }
}
