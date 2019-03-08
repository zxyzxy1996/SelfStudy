package com.array;

/**
 * @author RockerBaozi
 * @date 2019/3/6 19:26
 */
public class FindRepeat {

    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    break;
                } else if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(containsDuplicate(arr));
    }
}
