package starpattern;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0; i<n; i++){
            for(int space = 0; space<n-1-i; space++){
                System.out.print("  ");
            }

            for(int start = 0; start<=i; start++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
