package com.leetcode;
public class Demo709 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int c = (int) chars[i];
            if (c <= 90 || c >= 65){
                res.append((char)(c+32));
            }else {
                res.append(chars[i]);
            }
        }
        return res.toString();
    }
}
