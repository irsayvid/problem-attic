package easy;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// 11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
public class MatchingRule {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int rows = in.nextInt();
        List<List<String>> list = new ArrayList<>();
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            List<String> temp = new ArrayList<String>();
            for (int j=0; j < 3; j++) {
                temp.add(in.next());
            }
            list.add(temp);
        }
        System.out.print("Enter rule key: ");
        String ruleKey = in.next();
        System.out.print("Enter rule value: ");
        String ruleValue = in.next();
        System.out.println("Number of items matching given rule: "+ countMatches(list, ruleKey, ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int checker;
        if (ruleKey.equals("type")){
            checker = 0;
        }
        else if(ruleKey.equals("color")){
            checker = 1;
        }
        else{
            checker = 2;
        }
        int count = 0;
        for(int i=0;i<items.size();i++)
            if(items.get(i).get(checker).equals(ruleValue))
                count++;
        return count;
    }
}
