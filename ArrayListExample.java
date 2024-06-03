import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(410);
//        list.add(140);
//        list.add(10);
//        list.add(140);
//        list.add(140);
//        list.add(104);
//        list.add(103);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);

        for(int i = 0; i < 5; i++){
            list.add(key.nextInt());
        }
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));;
        }
        System.out.println(list);
    }
}
