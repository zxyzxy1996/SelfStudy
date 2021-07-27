package com.myself.geek;

import java.util.ArrayList;

public class Lesson5_1 {
    // 四种面额的纸币
    public static long[] rewards = {1, 2, 5, 10, 20, 50};

    /**
     * @param totalReward-奖赏总金额，result-保存当前的解
     * @return void
     * @Description: 使用函数的递归（嵌套）调用，找出所有可能的奖赏组合
     */

    public static void get(long totalReward, ArrayList<Long> result) {

        if (totalReward == 0) {
            System.out.println(result);
            return;
        } else if (totalReward < 0) {
            return;
        } else {
            for (int i = 0; i < rewards.length; i++) {
                ArrayList<Long> newResult = (ArrayList<Long>) result.clone();
                newResult.add(rewards[i]);
                get(totalReward - rewards[i], newResult);
            }
        }
    }

    public static void main(String[] args) {
        int totalReward = 50;
        Lesson5_1.get(totalReward, new ArrayList<>());
    }
}
