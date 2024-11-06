import java.util.*;

class LaptopRecommendation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Read the number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt();  // Read the number of friends
            int[] recommendations = new int[11];  // Create an array to count recommendations (index from 1 to 10)

            // Count recommendations for each laptop
            for (int i = 0; i < N; i++) {
                int laptopNumber = scanner.nextInt();
                recommendations[laptopNumber]++;
            }

            // Find the laptop with the maximum recommendations
            int maxRecommendations = 0;
            int laptopToBuy = -1;
            boolean isConfused = false;

            for (int i = 1; i <= 10; i++) {
                if (recommendations[i] > maxRecommendations) {
                    maxRecommendations = recommendations[i];
                    laptopToBuy = i;
                    isConfused = false;  // Reset confusion as we found a new max
                } else if (recommendations[i] == maxRecommendations) {
                    isConfused = true;  // Found another laptop with the same max recommendations
                }
            }

            // Output the result
            if (isConfused) {
                System.out.println("CONFUSED");
            } else {
                System.out.println(laptopToBuy);
            }
        }
      
    }
}
