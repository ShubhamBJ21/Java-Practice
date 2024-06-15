package arrays;

import java.util.Arrays;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = {8,5,3,0,5,2,8};
        checkRepeatedArray(arr);
    }

    public static void checkRepeatedArray(int[] arr){
        int[] count = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            
            int ct = 0;

            for(int j=i+1; count[i] != -1 && j<arr.length; j++){
                if(arr[i] == arr[j]){
                    i++;
                    count[j] = -1;
                }
            }

            if(count[i] != -1){
                count[i] = ct;
            }
        }

        for(int i=0; i<count.length; i++){
            if(count[i] != -1){
                System.out.println(arr[i] + " is repeated "+(count[i]+1)+" times");
            }
        }
        System.out.println(Arrays.toString(count));
    }
}
