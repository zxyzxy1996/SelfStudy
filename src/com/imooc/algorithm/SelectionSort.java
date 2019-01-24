package com.imooc.algorithm;

public class SelectionSort {
    private SelectionSort() {

    }

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer arr[] = {4, 3, 5, 6, 7, 9, 1, 10};
        SelectionSort.sort(arr);

        for (int num : arr) {
            System.out.print(num);
            System.out.print(' ');
        }

        System.out.println();
    }
}
