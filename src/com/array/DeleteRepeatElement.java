package com.array;

/**
 * @author RockerBaozi
 * @date 2019/2/26 13:27
 */
public class DeleteRepeatElement {

    public static int removeDuplicates(int[] nums) {

        int number = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[number]) {
                number++;
                nums[number] = nums[i];
            }
        }

        return ++number;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);

    }
}
