import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static int[] quickSort(int[] arr) {
        // TODO:
        divNCon(arr, 0, arr.length-1);
        return arr;
    }

    public static void divNCon(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = partition(arr,start,end);
        divNCon(arr,start,mid-1);
        divNCon(arr,mid,end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot=arr[(start+end)/2];
        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end) {
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for(int i = 0; i < 100000; i++) {
            arr[i] = 99999-i;
        }
        int[] output = quickSort(arr);
        System.out.println(Arrays.toString(output)); // --> [1, 3, 21]
  }
}