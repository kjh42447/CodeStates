package section2.Algorithm.DP;
import java.util.*;

public class Ocean {
    public long ocean(int target, int[] type) {
        long[][] dp = new long[type.length][target+1];    //dp[i][j] = ocean(j, type[:i])
        // {a, b, c, ...} 일때
        //                                                      0 or 1
        // ocean(target, {a, b, c}) = ocean(target, {a, b}) + ocean(target, {c}) + ocean(target-(c*n), {a, b})

        // 먼저 dp[0][]만 초기화
        for (int i = 1; i <= target; i++) {
            if (i % type[0] == 0)   dp[0][i] = 1;
        }

        // 윗 행을 참조 가능하므로 반복 시작
        for (int i = 1; i < type.length; i++) {
            for (int j = 1; j <= target; j++) {
                // ocean(target, {a, b, c}) = ocean(target, {a, b}) + ocean(target, {c}) + ocean(target-(c*n), {a, b})
                dp[i][j] = dp[i - 1][j];
                if (j % type[i] == 0)   dp[i][j] += 1;
                int ti = type[i];
                for (int k = ti; k < j; k += ti) {
                    dp[i][j] += dp[i-1][j - k];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            long[] inArr = dp[i];
            for (int j = 0; j < inArr.length; j++) {
                System.out.print(inArr[j] + " ");
            }
            System.out.println();
        }
        return dp[type.length-1][target];
    }
}
