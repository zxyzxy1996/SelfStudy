package com.imooc.algorithm.sort;

/**
 * @author Zheng Xinyu
 */
public class QuickSortCopy implements SortInterface {

    public QuickSortCopy() {}

    @Override
    public Object[] sort(Comparable[] arr) {
        int length = arr.length;

        sort(arr, 0, length - 1);

        return arr;
    }

    private void sort(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int p = partition(arr, left, right);
        sort(arr, left, p - 1);
        sort(arr, p + 1, right);
    }

    private int partition(Comparable[] arr, int left, int right) {

        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i].compareTo(arr[left]) < 0) {
                swap(arr, ++j, i);
            }
        }
        swap(arr, left, j);

        return j;
    }

    private void swap(Object[] arr, int i, int j) {
        Object o = arr[i];
        arr[i] = arr[j];
        arr[j] = o;
    }
}
