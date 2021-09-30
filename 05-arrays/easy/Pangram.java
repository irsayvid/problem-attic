package easy;// 10. [Check if the Sentence Is easy.Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String sentence = in.next();
        System.out.println("Is pangram? "+checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        if (len < 26){
            return false;
        }
        int[] alphabets = new int[26];
        int count = 0;
        for (int i = 0; i < len; i++){
            int temp = sentence.charAt(i) - 97;
            if(alphabets[temp] != 1){
                count += 1;
                alphabets[temp] = 1;
            }
            if(count == 26){
                return true;
            }
        }
        return count == 26;
    }
}
