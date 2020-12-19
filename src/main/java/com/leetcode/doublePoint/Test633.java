package com.leetcode.doublePoint;

/**
 * @program: csnote
 * @description: 633. 平方数之和
 * @url: https://leetcode-cn.com/problems/sum-of-square-numbers/description/
 * @author: huzhpm
 * @create: 2020-12-17 16:43
 **/
public class Test633 {
    public boolean judgeSquareSum(int c) {
        if(c < 2){
            return true;
        }
        int i = 0;
        int j = (int) Math.sqrt(c);
        while(i <= j){
            int i2 = i * i;
            int j2 = j * j;
            int sum = i2 + j2;
            if(sum == c){
                return true;
            }else if(sum > c){
                j--;
            }else if(sum < c){
                i++;
            }
        }
        return false;
    }
}
