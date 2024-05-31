import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        int sum = 0;
         
        for(int i = num; i > 0; i/=10){
            int lastDigit = i % 10;
            sum = sum + lastDigit;
        }
        System.out.println(sum);
        key.close();
    }
    
}
//765