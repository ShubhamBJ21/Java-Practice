/* sort as negative element to left side or positive element right side */

package arrays;

import java.util.Arrays;

public class NegativePositive {

    public static void main(String[] args) {
        int[] arr = {1,-3,5,-7,3,-6,-9};

        sortNegativePositive(arr);

        System.out.println(Arrays.toString(arr));
    }
    
    static void sortNegativePositive(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
