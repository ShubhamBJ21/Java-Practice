package arrays;

import java.util.HashSet;

public class CreateUniqueArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,2,4};
        int[] uniqueArray = unique(arr);

        for(int i : uniqueArray){
            System.out.println(i+" ");
        }
    }

    static int[] unique(int arr[]){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            hashSet.add(arr[i]);
        }

        int[] uniqueArray = new int[hashSet.size()];
        int index = 0;
        for(Integer num : hashSet){
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
