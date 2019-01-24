package com.leetcode;

public class Demo905 {
    public int[] sortArrayByParity(int[] A) {
        int arr[] = new int[A.length];
        int a = 0;

        for (int i = 0; i < A.length; i ++){
            if (A[i] % 2 == 0){
                arr[a] = A[i];
                a++;
            }
        }

        for (int i = 0; i < A.length; i ++){
            if (A[i] % 2 != 0){
                arr[a] = A[i];
                a++;
            }
        }

        return arr;
    }
}
