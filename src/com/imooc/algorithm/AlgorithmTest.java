package com.imooc.algorithm;

import java.util.Arrays;

public class AlgorithmTest {
    public static void main(String[] args) {

        SortTestHelper sortTestHelper = new SortTestHelper();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();

//        Comparable arr[] = sortTestHelper.generateRandomArray(1000000, 1, 100);
//        double time3 = sortTest(mergeSort, arr);
//        System.out.println("MergeSort with randomArray: " + time3 + "s");

        Sort sort = new Sort();
        Comparable arr2[] = sortTestHelper.generateRandomArray(1000000, 1, 100);
        sort.MergeSort(arr2);
        System.out.println(sortTestHelper.isSorted(arr2));
    }

    private static double sortTest(SortInterface sort , Comparable[] arr) {
        SortTestHelper sortTestHelper = new SortTestHelper();
        long startTime = System.nanoTime();

        sort.sort(arr);

        long endTime = System.nanoTime();
//        sortTestHelper.printArray(arr);
        if (sortTestHelper.isSorted(arr)) {
            return (endTime - startTime) / 1000000000.0;
        } else {
            return -1;
        }
    }

}
