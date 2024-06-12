package arrays;

public class NumberConvertToChar {
    public static void main(String[] args) {
        int arr[] = {12, 54, 123, 543, 97, 66};
        convertChar(arr);
    }

    static void convertChar(int arr[]){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0 && arr[i]<=127){
                char ch = (char)arr[i];

                System.out.println(arr[i]+"---------->"+ch);
                count++;
            }
        }
        System.out.println("Count of ASCII characters are: "+count);
    }
}
