package com.imooc.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Comparable[] array = {3, 1, 2, 5, 4, 6, 9, 7, 10, 8};

        QuickSortCopy quickSort = new QuickSortCopy();
        Object[] sortArray = quickSort.sort(array);

        System.out.println(Arrays.asList(sortArray).toString());

    }
}
