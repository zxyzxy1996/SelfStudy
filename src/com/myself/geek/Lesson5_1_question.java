package com.myself.geek;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Zheng Xinyu
 */
public class Lesson5_1_question {

    /**
     * @return void
     * @Description: 使用函数的递归（嵌套）调用，找出所有可能因式分解组合
     */


    public static void get(int totalValue, ArrayList<Integer> result) {

        if (totalValue == 1) {
            if (!result.contains(1)) {
                result.add(1);
            }
            System.out.println(result);
            return;
        } else {
            for (int i = 1; i <=totalValue; i++) {
                if (i == 1 && result.contains(1)) {
                    continue;
                }
                if (totalValue % i != 0) {
                    continue;
                }
                ArrayList newResult = (ArrayList) result.clone();
                newResult.add(i);
                get(totalValue / i, newResult);

            }
        }
    }

    public static void main(String[] args) {
        get(30,new ArrayList<>());
    }

}
