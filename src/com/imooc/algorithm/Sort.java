package com.imooc.algorithm;

public class Sort {
    public Sort() {

    }

    public void SelectionSort(Comparable arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public void InsertionSort(Comparable arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            Comparable e = arr[i];
            for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    private void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
