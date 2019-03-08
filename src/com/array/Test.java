package com.array;

import java.util.Arrays;

/**
 * @author RockerBaozi
 * @date 2019/3/4 13:44
 */
public class Test {
    public static void main(String[] args) {
        /*
        {5, 1, 2, 3, 4}
         */
        int arr[] = {1, 2, 3, 4, 5};
        int len = arr.length;

        int lastNum = arr[len - 1];
        for (int i = len - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastNum;

        System.out.println(Arrays.toString(arr));
    }
}
