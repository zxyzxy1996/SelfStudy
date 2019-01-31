package com.imooc.algorithm.sort;

public class AlgorithmTest {
    public static void main(String[] args) {

        SortTestHelper sortTestHelper = new SortTestHelper();
//        SelectionSort selectionSort = new SelectionSort();
//        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        MergeSortBU mergeSortBU = new MergeSortBU();
        QuickSort quickSort = new QuickSort();

        Sort sort = new Sort();
        Comparable arr1[] = sortTestHelper.generateRandomArray(10000000, 1, 1000000);
        Comparable arr2[] = sortTestHelper.generateRandomArray(10000000, 1, 1000000);
        Comparable arr3[] = sortTestHelper.generateRandomArray(10000000, 1, 1000000);
        double time1 = sortTest(quickSort, arr1);
        System.out.println("QuickSort " + time1 + " s");
        double time2 = sortTest(mergeSort, arr2);
        System.out.println("MergeSort " + time2 + " s");
        double time3 = sortTest(mergeSortBU, arr3);
        System.out.println("MergeSortBU " + time3 + " s");
        System.out.println(sortTestHelper.isSorted(arr3));
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
