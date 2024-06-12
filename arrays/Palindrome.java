package arrays;

public class Palindrome {
    public static void main(String[] args) {
        int arr[] = {1,2,4,2,1};
        
        System.out.println(palindrome(arr));
    }

    static String palindrome(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while (low<high) {
            if(arr[low] == arr[high]){
                low++;
                high--;
            }
            else{
                return "Array is not palindrome";
            }
        }
        return "Array is palindrome";
    }
}
