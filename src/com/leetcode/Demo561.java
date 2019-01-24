package com.leetcode;

import java.util.Arrays;

public class Demo561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i <= nums.length - 2; i = i + 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int a[] = {7, 3, 1, 0, 0, 6};
        arrayPairSum2(a);
    }

    // 可以用桶排序加速 int[20001]
    public static int arrayPairSum2(int[] nums){
        int[] a = new int[20001];
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            a[nums[i] + 10000]++;
        }

        boolean even = false;
        for(int i=0; i<a.length; i++){
            while(a[i] > 0){
                if(!even){
                    sum += i - 10000;
                }
                even = !even;
                a[i]--;
            }
        }
        return sum;
    }
}
