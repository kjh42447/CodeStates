import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static int orderOfPresentation(int N, int[] K) {
        // TODO:
        int result = 0;
        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            int facCount = N-i-1;
            int fac = 1;
            int mulCount = K[i]-1;

            for (int j = 1; j <= facCount; j++) {
                fac *= j;
            }

            for (int j = 0; j < K[i]-1; j++) {
                if (visited[j]){
                    mulCount--;
//                    System.out.println(j);
                }
            }
            visited[K[i]-1] = true;
            result += fac*mulCount;
//            System.out.println(Arrays.toString(visited));
//            System.out.printf("i : %d, K[i] : %d, mC = %d, fac : %d, re : %d\n", i, K[i], mulCount, fac, result);
        }

        return result;
    }

    public static void main(String[] args) {
        int output = orderOfPresentation(3, new int[]{2, 3, 1});
        System.out.println(output); // 3

        output = orderOfPresentation(5, new int[]{1, 3, 2, 4, 5});
        System.out.println(output); // 6

        output = orderOfPresentation(7, new int[]{7, 6, 5, 4, 3, 2, 1});
        System.out.println(output); // 6
  }
}