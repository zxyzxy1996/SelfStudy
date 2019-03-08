package com.array;

/**
 * @author RockerBaozi
 * @date 2019/3/8 15:07
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int onlyOne = nums[0];

        for(int i = 1; i < nums.length; i++){
            onlyOne = onlyOne ^ nums[i];
        }

        return onlyOne;
    }
}
