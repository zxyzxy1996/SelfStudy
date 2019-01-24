package com.imooc.algorithm;

public class InsertionSort {
    private InsertionSort() {

    }

    public static void sort(Comparable arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            //写法1
//            for (int j = i; j > 0; j--) {
//                if (arr[j].compareTo(arr[j - 1]) < 0) {
//                    swap(arr, j, j - 1);
//                } else {
//                    break;
//                }
//            }

            //写法2
//            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
//                swap(arr, j, j - 1);
//            }

            //写法3
            Comparable e = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer arr[] = {4, 3, 5, 6, 7, 9, 1, 10};
        InsertionSort.sort(arr);

        for (int num : arr) {
            System.out.print(num);
            System.out.print(' ');
        }

        System.out.println();

        Double arr1[] = {4.1, 3.2, 5.5, 5.6, 5.7, 1.9, 1.6, 10.5};
        InsertionSort.sort(arr1);

        for (double num : arr1) {
            System.out.print(num);
            System.out.print(' ');
        }

        System.out.println();
    }
}
