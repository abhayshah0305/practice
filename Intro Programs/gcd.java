import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the Two Numbers:");
        
        int num1 = key.nextInt();
        int num2 = key.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("GCD is not defined for zero.");
            key.close();
            return;
        }
        
        int iter = Math.min(num1, num2);

        for(int i = iter; i > 0; i--){
            if(num1%i == 0 && num2 % i==0){
                System.out.println(i);
                break;
            }
        }
        key.close();
    }
}
