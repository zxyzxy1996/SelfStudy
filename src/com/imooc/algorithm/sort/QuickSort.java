package com.imooc.algorithm.sort;

public class QuickSort implements SortInterface {
    public QuickSort() {

    }

    @Override
    public Object[] sort(Comparable[] arr) {
        int n = arr.length;

        sort(arr, 0, n - 1);

        return arr;
    }

    //对arr[l...r]部分进行快速排序
    private void sort(Comparable[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    //对arr[l...r]部分进行partition操作
    // 返回p, 使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
    private int partition(Comparable[] arr, int l, int r) {
        Comparable v = arr[l];

        int j = l;
        // arr[l+1...j] < v ; arr[j+1...i) > v
        for (int i = l + 1; i <= r; i++) {
            if (arr[i].compareTo(arr[l]) < 0) {
                swap(arr, ++j, i);
            }
        }
        swap(arr, l, j);

        return j;
    }

    private void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
