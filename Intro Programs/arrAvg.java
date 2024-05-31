import java.util.Scanner;

public class arrAvg {
    static int avgarr(int arr[]){
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
    
        return sum / arr.length;
    }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int arrlength = key.nextInt();
        int[] arr = new int[arrlength];
        for(int i=0; i<arrlength;i++){
            arr[i] = key.nextInt();
        }
       System.out.print(avgarr(arr)); 
       key.close();
    }
  
}
