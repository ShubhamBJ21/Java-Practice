package arrays;

import java.util.Arrays;

public class MergeGivenArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9};

        System.out.println(Arrays.toString(merge(a, b)));
    }

    static int[] merge(int a[], int b[]){
        int n = a.length + b.length;

        int reuslt[] = new int[n];

        for(int i=0; i<n; i++){

            if(i<a.length){
                reuslt[i] = a[i];
            }
            else{
                reuslt[i] = b[i-a.length];
            }
        }

        return reuslt;
    }
}
