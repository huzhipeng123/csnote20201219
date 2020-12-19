package com.leetcode.doublePoint;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @program: csnote
 * @description: 345. 反转字符串中的元音字母
 * @url: https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/
 * @author: huzhpm
 * @create: 2020-12-17 17:36
 **/
public class Test345 {
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        if(s == null || s.length() < 1){
            return s;
        }
        char[] result = new String(s).toCharArray();
        int i = 0;
        int j = result.length - 1;
        while(i < j){
            if(vowels.contains(result[i]) && vowels.contains(result[j])){
                swap(result, i, j);
                i++;
                j--;
            }
            if(!vowels.contains(result[i])){
                i++;
            }
            if(!vowels.contains(result[j])){
                j--;
            }
        }
        return new String(result);
    }

    private void swap(char[] result, int i, int j) {
        char temp = result[i];
        result[i] = result[j];
        result[j] = temp;
    }
}
