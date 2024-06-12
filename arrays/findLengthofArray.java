package arrays;

public class findLengthofArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int count = 0;
        int i = 0;

        try{
            while (true) {
                int temp = arr[i];
                count++;
                i++;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Length of array is: "+count);
        }
    }
}
