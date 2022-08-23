import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static ArrayList<String> powerSet(String str) {
        // TODO:
        ArrayList<String> result = new ArrayList<String>();

        String[] arr = str.split("");

        HashSet<String> hashSet =  new HashSet<>(Arrays.asList(arr));
        String[] newarr = hashSet.toArray(new String[0]);
        Arrays.sort(newarr);

        // 원소 갯수
        // 0일 경우, 빈 리스트 추가
        result.add(new String());
        // 1 이상
        for (int i = 1; i <= newarr.length; i++) {
            //조합
            combination(result, newarr, new boolean[newarr.length], 0, newarr.length, i);
        }
        Collections.sort(result);
        return result;
    }

    public static void combination(ArrayList<String> result, String[] arr, boolean visited[], int depth, int n, int r){
        if (r == 0) {
            ArrayList<String> s = new ArrayList<>();
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    s.add(arr[i]);
                }
            }
            result.add(String.join("", s));
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

    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("abc");
        System.out.println(output1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]

        ArrayList<String> output2 = powerSet("jjump");
        System.out.println(output2); // ["", "j", "jm", "jmp", "jmpu", "jmu", "jp", "jpu", "ju", "m", "mp", "mpu", "mu", "p", "pu", "u"]
  }
}