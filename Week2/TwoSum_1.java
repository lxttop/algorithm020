package leetcode.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public static int[] twoSum(int[] nums, int target) {
        int numsLen = nums.length;
        for (int i = 0; i < numsLen -1; i++) {
            for (int j = i+1; j < numsLen; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static boolean twoSumExist(int[] nums, int target) {
        Arrays.sort(nums);
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; ) {
            int curSum = nums[i] + nums[j];
            if (curSum == target){
                return true;
            }else if (curSum > target){
                j--;
            }else{
                i++;
            }
        }
        return  false;
    }

    public static int[] twoSumII(int[] nums, int target) {
        int numsLen = nums.length;
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(target - nums[i])){
                return new int[]{table.get(target - nums[i]), i};
            }
            table.put(nums[i], i);
        }
        return  new int[]{};
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,3,10,0,0,8};
        for(int i=0;i<nums.length;i++){
            System.out.println(i+" : "+nums[i]);
        }

        System.out.println(twoSumExist(nums, 13));
        System.out.println(twoSumExist(nums, 14));

    }
}
