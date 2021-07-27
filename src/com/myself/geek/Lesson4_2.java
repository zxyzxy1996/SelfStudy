package com.myself.geek;

import java.math.BigDecimal;

public class Lesson4_2 {

    /**
     * @Description: 使用函数的递归（嵌套）调用，进行数学归纳法证明
     * @param k-放到第几格，result-保存当前格子的麦粒数和麦粒总数
     * @return boolean-放到第k格时是否成立
     */
    public static boolean prove(int k, Result result) {
        if (k < 1) {
            return false;
        }

        //证明 n = 1 时命题是否成立
        if (k == 1) {
            BigDecimal normal = new BigDecimal(2);
            if (0 == normal.pow(k).subtract(BigDecimal.ONE).compareTo(BigDecimal.ONE)) {
                result.wheatNum = 1;
                result.wheatTotalNum = 1;
                return true;
            } else {
                return false;
            }
        } else {
            //如果n = (k-1)时命题成立，证明n = k时命题成立
            boolean proveOfPreviousOne = prove(k - 1, result);
            result.wheatNum *= 2;
            result.wheatTotalNum += result.wheatNum;
            boolean proveOfCurrentOne = false;

            BigDecimal finalNum =new BigDecimal(2);
            if (0 == finalNum.pow(k).subtract(BigDecimal.ONE).compareTo(new BigDecimal(result.wheatTotalNum))) {
                proveOfCurrentOne = true;
            }

            return (proveOfCurrentOne && proveOfPreviousOne);
        }

    }

    public static void main(String[] args) {
        int grid = 3;
        Result result = new Result();
        System.out.println(Lesson4_2.prove(grid, result));
        System.out.println(result.wheatTotalNum);
    }
}

class Result {
    /**
     * 当前格的麦粒数
     */
    public long wheatNum = 0;

    /**
     * 目前为止麦粒的总数
     */
    public long wheatTotalNum = 0;
}
