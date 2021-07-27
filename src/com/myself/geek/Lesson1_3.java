package com.myself.geek;

import java.math.BigInteger;

/**
 * @author Zheng Xinyu
 */
public class Lesson1_3 {




    /**

     * @Description: 十进制转换成二进制
     * @param decimalSource
     * @return String
     */
    public static String decimalToBinary(int decimalSource) {
        //转换成BigInteger类型，默认是十进制
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));
        //参数2指定的是转化成二进制
        return bi.toString(2);
    }

    /**
     * @Description: 二进制转换成十进制
     * @param binarySource
     * @return int
     */
    public static int binaryToDecimal(String binarySource) {
        //转换为BigInteger类型，参数2指定的是二进制
        BigInteger bi = new BigInteger(binarySource, 2);
        //默认转换成十进制
        return Integer.parseInt(bi.toString());
    }

    /**
     * @Description: 二进制按位“或”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“或”的结果
     */
    public static int or(int num1, int num2) {

        return (num1 | num2);

    }

    /**
     * @Description: 二进制按位“与”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“与”的结果
     */
    public static int and(int num1, int num2) {

        return (num1 & num2);

    }

    /**

     * @Description: 二进制按位“异或”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“异或”的结果
     */

    public static int xor(int num1, int num2) {

        return (num1 ^ num2);

    }


    public static void main(String[] args) {

        String i = "010";

        System.out.println(Character.digit(i.charAt(0), 10));

    }



}