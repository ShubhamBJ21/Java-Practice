package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};

        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int arr[]){
        int low = 0; 
        int high = arr.length-1;

        while (low<=high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }

        return arr;
    }
}
