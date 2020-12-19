package com.leetcode.doublePoint;

/**
 * @program: csnote
 * @description:
 * 167. 两数之和 II - 输入有序数组
 * @url: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 * @author: huzhpm
 * @create: 2020-12-17 11:53
 **/
public class Test167 {

    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length < 2){
            return null;
        }
        int index1 = 0;
        int index2 = numbers.length - 1;
        if(numbers[index1] > target){
            return null;
        }
        while(index1 < index2){
            int sum = numbers[index1] + numbers[index2];
            if(sum == target){
                return new int[]{index1, index2};
            }else if(sum > target){
                index2--;
            }else if(sum < target){
                index1++;
            }
        }
        return null;
    }
}
