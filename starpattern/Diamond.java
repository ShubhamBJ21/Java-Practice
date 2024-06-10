package starpattern;

public class Diamond {
    public static void main(String[] args) {
        int n = 5; 

        // Top part of the diamond (Upright full pyramid)
        for(int i=0; i<n; i++){
            for(int space = 0; space<n-i-1; space++){
                System.out.print("  ");
            }

            for(int star = 0; star<2*i+1; star++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // Bottom part of the diamond (Inverted full pyramid)
        //i start from index 1 of inverted full pyramid
        
        for(int i=1; i<n; i++){
            for(int space = 0; space<i; space++){
                System.out.print("  ");
            }

            for(int star = 0; star< 2 * (n - i) - 1; star++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
