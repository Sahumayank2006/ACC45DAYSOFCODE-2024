import java.util.*;

 class CardSwipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] card = new int[N];
            for (int i = 0; i < N; i++) {
                card[i] = sc.nextInt();
            }

  HashSet<Integer> insideSet = new HashSet<>();
            int currentInside = 0;
            int maxInside = 0;

            for (int id : card) {
                if (insideSet.contains(id)) {
                    
                   insideSet.remove(id);
                    currentInside--;
                } else {
                    
                    insideSet.add(id);
                    currentInside++;
                }
                
                maxInside = Math.max(maxInside, currentInside);
            }

            System.out.println(maxInside);
        }
        
     
    }
}
