package easy;// 6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GreatestCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.print("Enter number of extra candies: ");
        int ec = in.nextInt();
        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Can become greatest with extra candies: "+ kidsWithCandies(nums,ec));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length, max = Integer.MIN_VALUE;
        ArrayList<Boolean> list = new ArrayList<>();
        for (int i = 0; i < len; i++){
            if(candies[i] > max){
                max = candies[i];
            }
            candies[i] += extraCandies;
        }
        for (int i = 0; i < len; i++) {
            if (candies[i] >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
