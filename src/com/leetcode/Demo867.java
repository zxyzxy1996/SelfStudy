package com.leetcode;

public class Demo867 {
    //RC转换
    public int[][] transpose(int[][] A) {
        int R = A.length; //3
        int C = A[0].length; //2

        int B[][] = new int[C][R];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                B[c][r] = A[r][c];
            }
        }

        return B;
    }
}
