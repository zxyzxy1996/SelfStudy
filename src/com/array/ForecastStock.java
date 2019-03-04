package com.array;

/**
 * @author RockerBaozi
 * @date 2019/3/4 9:44
 */
public class ForecastStock {
    public static int maxProfit(int[] prices) {
        int maxPro = 0, tmp = 0;
        for (int i = 1; i < prices.length; i++) {
            tmp = prices[i] - prices[i - 1];
            if (tmp > 0) {
                maxPro += tmp;
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(maxProfit(arr));
    }
}
