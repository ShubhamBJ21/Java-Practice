package starpattern;

public class HourGlassPattern {
    public static void main(String[] args) {
        int n = 5;

        //inverted pyramid
        for(int i=0; i<n; i++){
            for(int space = 0; space<i; space++){
                System.out.print("  ");
            }

            for(int star = 0; star< 2 * (n - i) - 1; star++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //pyramid
        for(int i=0; i<n; i++){
            for(int space = 0; space<n-i-1; space++){
                System.out.print("  ");
            }

            for(int star = 0; star<2*i+1; star++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
