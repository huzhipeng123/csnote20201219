package com.leetcode.doublePoint;

/**
 * @program: csnote
 * @description: 680. 验证回文字符串 Ⅱ
 * @url: https://leetcode-cn.com/problems/valid-palindrome-ii/
 * @author: huzhpm
 * @create: 2020-12-19 17:38
 **/
public class Test680 {
    public boolean validPalindrome(String s) {
        if(s == null || s.length() < 2){
            return true;
        }
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;
        while(i < j){
            if(charArray[i] == charArray[j]){

            }else{
                if(charArray[i + 1] != charArray[j] && charArray[i] != charArray[j - 1]){
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
}
