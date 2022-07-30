package section2.Algorithm.Recursive;
import java.util.*;

public class missHouseMeal {
    static void combination(ArrayList<String[]> result, String[] arr, boolean visited[], int depth, int n, int r){
        if (r == 0) {
            ArrayList<String> s = new ArrayList<>();
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    s.add(arr[i]);
                }
            }
            result.add(s.toArray(new String[s.size()]));
            return;
        }

        if(depth==n){
            return;
        }

        visited[depth] = true;
        combination(result, arr, visited,depth+1, n, r-1);

        visited[depth] = false;
        combination(result, arr, visited,depth+1, n, r);

        return;
    }

    // 문자열 배열 정렬 비교자 클래스
    public static class StringArrayComparator implements Comparator<String[]> {

        @Override
        public int compare(String[] o1, String[] o2) {
            return Arrays.toString(o1).compareTo(Arrays.toString(o2));
        }
    }

    static ArrayList<String[]> missHouseMeal(String[] sideDishes) {
        // TODO:
        Arrays.sort(sideDishes);
        ArrayList<String[]> result = new ArrayList<String[]>();

        // 원소 갯수
        // 0일 경우, 빈 리스트 추가
        result.add(new String[]{});
        // 1 이상
        for (int i = 1; i <= sideDishes.length; i++) {
            //조합
            combination(result, sideDishes, new boolean[sideDishes.length], 0, sideDishes.length, i);
        }

        // 문자열로 바꿔서 정렬 후 다시 배열로?..
        // 그냥 Comparator 구현
        Collections.sort(result, new StringArrayComparator());

        return result;
    }
}
