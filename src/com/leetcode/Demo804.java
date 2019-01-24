package com.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo804 {
    public static int uniqueMorseRepresentations(String[] words) {

        String codes[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();
        for (String word : words) {

            StringBuilder res = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                res.append(codes[word.charAt(i) - 'a']);
            }
            set.add(res.toString());
        }
        return set.size();
    }
}
