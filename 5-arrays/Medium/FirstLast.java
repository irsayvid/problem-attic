package Medium;
//4. [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

import java.util.Arrays;
import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        int target = in.nextInt();
        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("First last position: "+ Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = search(nums, target, true);
        if (res[0] != -1){
            res[1] = search(nums, target, false);
        }
        return res;
    }
    public static int search(int[] nums, int target, boolean isFirst){
        int start = 0;
        int end = nums.length - 1;
        int mid, res = -1;
        while (start <= end){
            mid = start + (end - start)/2;
            if (target < nums[mid]){
                end = mid-1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                res = mid;
                if (isFirst){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return res;
    }
}
