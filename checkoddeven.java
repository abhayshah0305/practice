
import java.util.Scanner;

public class checkoddeven {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Weight of the Watermelon:");
        int num = key.nextInt();
        if(num == 2 || num % 2 == 1){
            System.out.print("Not Possible!");
        }
        else{
            System.out.print("Possible!");
        }

    }    
}