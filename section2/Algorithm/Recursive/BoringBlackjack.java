package section2.Algorithm.Recursive;
import java.util.*;

public class BoringBlackjack {
    static boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {

            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void combination(int[] arr, ArrayList<Integer> output, boolean visited[], int depth, int n, int r){
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    sum += arr[i];
                }
            }
            if (isPrime(sum)) {
                output.add(sum);
            }
            return;
        }

        if(depth==n){
            return;
        }

        visited[depth] = true;
        combination( arr, output, visited,depth+1, n, r-1);

        visited[depth] = false;
        combination(arr, output, visited,depth+1, n, r);

        return;
    }
    public static int boringBlackjack(int[] cards) {
        // TODO:
        ArrayList<Integer> prime = new ArrayList<Integer>();
        combination(cards, prime, new boolean[cards.length], 0, cards.length, 3);
        return prime.size();
    }
}
