import java.util.*;

class PoliceandThief {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // Read the number of test cases
        while (T-- > 0) { // Loop through each test case
            int X = sc.nextInt(); // Read the position of the policeman
            int Y = sc.nextInt(); // Read the position of the thief
            int time = Math.abs(X - Y); // Calculate the minimum time
            System.out.println(time); // Output the result
        }
    }
}
