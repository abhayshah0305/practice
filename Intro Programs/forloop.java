import java.util.Scanner;

class forloop{
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
        key.close();
    }
}