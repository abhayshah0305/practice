package patterns;

public class pattern {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
    }
    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();//space
    }
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();//space
    }
    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();//space
    }
    static void pattern5(int n){
        for(int row = 0; row < (2*n); row++){
            int totalColsInRow = row > n ? 2 * n - row : row;
            for(int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern6(int n){
        // outer loop to handle rows
        for (int i = n; i >= 1; i--) {
 
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
 
            // inner loop to print stars.
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
 
            // printing new line for each row
            System.out.println();
        }
    }
    
}
