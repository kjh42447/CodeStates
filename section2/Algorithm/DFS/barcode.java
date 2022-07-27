import java.util.*;

public class Test {
    public static boolean checkStack(int[] stack, int index) {
        boolean flag = true;
        for (int i = 0; i < (index+1)/2; i++) {
            //0 1 2 3 4 5 6 7 8
            //index-2i-1...,index-i-1,index-i,...,index-0
            for (int j = 0; j <= i; j++) {
                flag = true;
                if (stack[index-j] != stack[index-i-j-1]) {
                    flag = false;
                    break;
                }
            }
            //인접행렬이 같은 경우가 생기면 탈출
            if (flag) {
                return true;
            }
        }
        return false;
    }
    public static String barcode(int len) {
        // TODO:
        // int[][] graph = new int[][] {
        // 	{0, 1, 1},
        // 	{1, 0, 1},
        // 	{1, 1, 0}
        // };
        int[] stack = new int[len];
        stack[0] = 1;
        int index = 1;
        boolean sameflag = true;
        // stack : 0 0 0 0 0 0 0 0 0 0...

        //DFS
        //스택 길이가 len이 될때까지
        while (index < len) {
            //스택에 1,2,3을 순서대로 추가
            for (int n = 1; n <= 3; n++) {
                //index에 숫자 추가하고 중복 검사후 while문으로
                stack[index] = n;
                //인접행렬 검사
                sameflag = checkStack(stack, index);

                //비교시 통과하면 index 증가
                if (!sameflag) {
                    index++;
                    break;
                }
            }
            //1, 2, 3 전부 들어가지 못할 경우 앞 숫자를 1 증가하고 index--
            //인접행렬 검사
            while (sameflag) {
                stack[index] = 0;
                stack[index-1] += 1;
                if (stack[index-1] == 4) {
                    index--;
                    stack[index] = 0;
                    stack[index-1] += 1;
                }
                sameflag = checkStack(stack, index-1);
            }
        }

        //정답
        return Arrays.toString(stack).replaceAll("[^0-9]","");
    }

    // 아래 코드는 변경하지 마세요.
  
  public static void main(String[] args) {
    String output = barcode(3);
    
    output = barcode(20);
    System.out.println(output); // "12131231321231213123"
  }
}