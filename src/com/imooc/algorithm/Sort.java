package com.imooc.algorithm;

import java.util.Arrays;

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

    public void MergeSort(Comparable arr[]) {
        int n = arr.length;
        MergeSort(arr, 0, n - 1);
    }

    private void MergeSort(Comparable arr[], int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (r - l) / 2 + l;

        MergeSort(arr, l, mid);
        MergeSort(arr, mid + 1, r);
        Merge(arr, l, mid, r);
    }

    private void Merge(Comparable arr[], int l, int mid, int r) {
        Comparable aux[] = Arrays.copyOfRange(arr, l, r + 1);

        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l].compareTo(aux[j - l]) < 0) {
                arr[k] = aux[i - l];
                i++;
            } else {
                arr[k] = aux[j - l];
                j++;
            }
        }
    }

    private void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
