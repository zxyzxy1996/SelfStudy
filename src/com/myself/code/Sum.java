package com.myself.code;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Sum {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    //计算arr[l...n]这个区间内的所有数字的和
    private static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }

    private final Map<String, String> map = new HashMap<>();

    public void putMap(String key, String value) {
        map.put(key, value);
    }

    public String getMap(String key) {
        return map.get(key);
    }

    public static void main(String[] args) {

        Sum sum = new Sum();
        sum.putMap("a","b");
        String a = sum.getMap("a");

        System.out.println(a);
    }
}
