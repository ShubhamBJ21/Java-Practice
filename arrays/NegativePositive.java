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

        int i = 0, j=arr.length-1;

        while(i<j){
            if (arr[i]>0 && arr[j]<0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[j]>0){
                j--;
            }else if(arr[i]<0){
                i++;
            }
        }

    }
}
