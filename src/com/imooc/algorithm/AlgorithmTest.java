package com.imooc.algorithm;

public class AlgorithmTest {
    public static void main(String[] args) {

        SortTestHelper sortTestHelper = new SortTestHelper();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();

//        Comparable arrSelection1[] = sortTestHelper.generateRandomArray(100000, 1, 100000);
//        Comparable arrInsertion1[] = sortTestHelper.generateRandomArray(100000, 1, 100000);
        Comparable arrSelection2[] = sortTestHelper.generateNearlyOrderedArray(100000, 1000);
        Comparable arrInsertion2[] = sortTestHelper.generateNearlyOrderedArray(100000, 1000);
//        double time1 = sortTest(selectionSort, arrSelection1);
//        System.out.println("SelectionSort with randomArray: " + time1 + "s");
//        double time2 = sortTest(insertionSort, arrInsertion1);
//        System.out.println("InsertionSort with randomArray: " + time2 + "s");

        double time3 = sortTest(selectionSort, arrSelection2);
        System.out.println("SelectionSort with swapArray: " + time3 + "s");
        double time4 = sortTest(insertionSort, arrInsertion2);
        System.out.println("InsertionSort with swapArray: " + time4 + "s");
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
