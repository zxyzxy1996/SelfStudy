package com.array;

import java.util.Arrays;

/**
 * @author RockerBaozi
 * @date 2019/3/4 13:28
 */
public class RotatedArrays {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;

        //方法1
//        for (int i = 0; i < k; i++) {
//            int lastNum = nums[len - 1];
//
//            for (int j = len - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//
//            nums[0] = lastNum;
//        }

        //方法2
//        if (k != 0) {
//            int[] arr = new int[len];
//            for (int i = 0; i < len; i++) {
//                arr[(i + k) % len] = nums[i];
//            }
//            for (int i = 0; i < len; i++) {
//                nums[i] = arr[i];
//            }
//        }

        //方法3
        if (k != 0) {
            k %= nums.length;
            reverse(nums, 0, len - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, len - 1);
        }

    }

    private static void reverse(int[] nums, int left, int right) {
        for(int i = left; left < right && i < right; i++){
            nums[i] = nums[right] ^ nums[i];
            nums[right] = nums[right] ^ nums[i];
            nums[i] = nums[right] ^ nums[i];
            right--;
        }
    }


    public static void main(String[] args) {
        //[5, 6, 7, 1, 2, 3, 4]
        int arr[] = {1, 2};
        rotate(arr, 1);

        System.out.println(Arrays.toString(arr));
    }
}
