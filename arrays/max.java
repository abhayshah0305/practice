package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int length = key.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = key.nextInt();
        }
        System.out.println("The Array is: " + Arrays.toString(arr));
        System.out.println("Max Element is: " + maxElement(arr));
    }
    static int maxElement(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
