import java.util.*;

class EncodingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        while (T-- > 0) {
            int N = sc.nextInt(); // length of the string
            String S = sc.next(); // original  string

            
            char[] arr = S.toCharArray();

            // Swap adjacent characters
            for (int i = 0; i < N - 1; i += 2) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            // Replace each character with its 'mirror' character
            for (int i = 0; i < N; i++) {
                arr[i] = (char) ('z' - (arr[i] - 'a'));
            }

            // Convert the character array back to a string
            String encodedMessage = new String(arr);
            System.out.println(encodedMessage);
        }
        
    }
}
