package leetcode.practice;

public class MoveZeros_283 {
    public static void moveZeroes(int[] nums) {
        int untilnowZeroCount = 0;
        int arrayLen = nums.length;
        for (int i = 0; i < arrayLen; i ++){
            if(nums[i] == 0){
                untilnowZeroCount++;
            }else{
                if(untilnowZeroCount > 0){
                    nums[i-untilnowZeroCount] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,3,10,0,0,8};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(i+" : "+nums[i]);
        }
    }
}
