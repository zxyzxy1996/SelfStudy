package com.leetcode;

public class Demo832 {
    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[i][j] = A[i][A[i].length - j - 1];
            }

            for (int j = 0; j < A[i].length; j++) {
                B[i][j] = B[i][j] ^ 1;
            }
        }

        return B;
    }

    public static int[][] flipAndInvertImageNew(int[][] A) {
        int temp;

        for (int a[] : A) {
            for (int i = 0; i < A.length / 2; i++) {
                temp = a[i] ^ 1;
                a[i] = a[A.length - 1 - i] ^ 1;
                a[A.length - 1 - i] = temp;
            }

            if (A.length % 2 == 1) {
                a[A.length / 2] = a[A.length / 2] ^ 1;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][]B = flipAndInvertImageNew(A);
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.println(B[i][j]);
            }
        }
    }
}
