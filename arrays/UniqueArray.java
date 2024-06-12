package arrays;

public class UniqueArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        System.out.println(unique(arr));
    }

    static String unique(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]  == arr[j]){
                    return "Array is not unique";
                }
            }
        }
        return "Array is unique";
    }
}
