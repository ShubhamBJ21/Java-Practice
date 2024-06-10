package starpattern;

public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }

            for (int star = 0; star < 2 * i + 1; star++) {

                if (i==n-1 || star == 0 || star == 2 * i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
