package section2.Algorithm.Recursive;
import java.util.*;
import java.util.stream.Collectors;

//순열
public class newChickenRecipe {
    static ArrayList<Integer[]> permutation(ArrayList<Integer[]> stfarr, ArrayList<Integer> arr, int[] output, boolean visited[], int depth, int n, int r){
        if(depth==r){
            stfarr.add(Arrays.stream(output).boxed().toArray(Integer[]::new));
            return stfarr;
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i]=true;
                output[depth]=arr.get(i);
                permutation(stfarr, arr,output,visited,depth+1,n,r);
                visited[i]=false;
            }
        }
        return stfarr;
    }
    public static ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // TODO:
        ArrayList<Integer[]> recipe_list = new ArrayList<>();
        ArrayList<Integer> stfArr = (ArrayList<Integer>) Arrays.stream(stuffArr).boxed().collect(Collectors.toList());

        //0이 3개 이상인 재료 제거
        for (int i = stfArr.size()-1; i >= 0 ; i--) {
            int count = 0;
            String s = stfArr.get(i).toString();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0') count++;
                if (count >= 3) break;
            }
            if (count >= 3) stfArr.remove(i);
        }
        Collections.sort(stfArr);

        //재귀
        if (stfArr.size() < choiceNum) {
            return null;
        }
        boolean[] visited = new boolean[stfArr.size()];
        recipe_list = permutation(recipe_list, stfArr, new int[choiceNum], visited, 0, stfArr.size(), choiceNum);

        return recipe_list;
    }
}
