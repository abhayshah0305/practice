package patterns;

public class patternstest {
    public static void main(String[] args) {
        pattern17(5);
    }
    static void pattern1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void pattern2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= (n-i)+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        
        for(int row = 1; row <= n; row++){

            for(int spaces = 0; spaces < (n-row); spaces++){
                System.out.print("  ");
            }

            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }

            System.out.println();

        }
    }
    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

}
