package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayrev {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int length = key.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = key.nextInt();
        }
        System.out.println("The Array is: " + Arrays.toString(arr));
        rev(arr);
        System.out.println("Reversed Arrays is: " + Arrays.toString(arr));
    }
    static void rev(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
