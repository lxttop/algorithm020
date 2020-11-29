package leetcode.practice;

public class RemoveDuplicates_26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    // 如果数组是非排序的
    public static int removeDuplicatesII(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0;
        for(int i = 1; i < nums.length; i++){
            boolean status = false;
            for (int j = 0; j <=k; j++){
                if(nums[i] == nums[j]){
                    status = true;
                    break;
                }
            }
            if(!status){
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,2};
        System.out.println(removeDuplicatesII(nums));
        for(int i=0;i<nums.length;i++){
            System.out.println(i+" : "+nums[i]);
        }
    }

}
