package arrays;

import java.util.Arrays;

public class ZigZag {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7};

        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    static int[] mergeArray(int arr1[], int arr2[]){
        int ans[] = new int[arr1.length + arr2.length];

        int small = Math.min(arr1.length, arr2.length);
        small = small * 2;

        for(int i=0, j=0; j<ans.length; i++, j++){

            if(i<small){
                ans[i] = arr1[j];
                ans[i+1] = arr2[j];
                i++;
            }
            else{
                if(j<arr1.length){
                    ans[i] = arr1[j];
                }
                else if (j<arr2.length) {
                    ans[i] = arr2[j];
                }
            }
        }
        return ans;
    }
}
