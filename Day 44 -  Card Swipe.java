import java.util.*;

 class CardSwipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] swipeIds = new int[N];
            for (int i = 0; i < N; i++) {
                swipeIds[i] = sc.nextInt();
            }

            
            HashSet<Integer> insideSet = new HashSet<>();
            int currentInside = 0;
            int maxInside = 0;

            for (int id : swipeIds) {
                if (insideSet.contains(id)) {
                    // If the ID is already in the set, it's an out-swipe
                    insideSet.remove(id);
                    currentInside--;
                } else {
                    // If the ID is not in the set, it's an in-swipe
                    insideSet.add(id);
                    currentInside++;
                }
                // Update the maximum count of people inside
                maxInside = Math.max(maxInside, currentInside);
            }

            System.out.println(maxInside);
        }
        
     
    }
}
