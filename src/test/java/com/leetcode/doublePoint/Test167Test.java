package com.leetcode.doublePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test167Test {
    @Test
    public void  check(){
        Test167 test = new Test167();
        int[] number = new int[] {2,7,11,15};
        int target = 9;
        int[] result = test.twoSum(number, target);
        assert number[result[0]] + number[result[1]] == target;
    }

}