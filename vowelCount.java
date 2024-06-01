import java.util.*;

public class vowelCount {
    static boolean isVowel(char ch){
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    static int vowelCnt(String word){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String word = key.nextLine();

        System.out.println(vowelCnt(word));
        key.close();
    }
}
