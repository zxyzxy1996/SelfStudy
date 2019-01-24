package com.imooc.datastructure.set;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FileOperation {

    //读取文件名为filename中的内容，并将其中包含的所有词语放进words中
    public static boolean readFile(String fileName, ArrayList<String> words) {

        if (fileName == null || words == null) {
            System.out.println("fileName is null or words is null");
            return false;
        }

        //文件提取
        Scanner scanner;

        try {
            File file = new File(fileName);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis), "UTF-8");
                scanner.useLocale(Locale.ENGLISH);
            } else {
                return false;
            }
        } catch (IOException ioe) {
            System.out.println("Cannot open" + fileName);
            return false;
        }

        //简单分词
        //这个分词方式相对相对简陋，没有考虑很多文本处理中的特殊问题
        //在这里只做demo展示用
        if (scanner.hasNextLine()) {

            String contents = scanner.useDelimiter("\\A").next();

            int start = firstCharacterIndex(contents, 0);
            for (int i = start + 1; i <= contents.length(); ) {
                if (i == contents.length() || !Character.isLetter(contents.charAt(i))) {
                    String word = contents.substring(start, i).toLowerCase();
                    words.add(word);
                    start = firstCharacterIndex(contents, i);
                    i = start + 1;
                } else {
                    i++;
                }
            }
        }
        return true;
    }

    //寻找字符串s中，从start的位置开始的第一个字母字符的位置
    private static int firstCharacterIndex(String s,int start){

        for (int i = start; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                return i;
            }
        }
        return s.length();
    }
}
