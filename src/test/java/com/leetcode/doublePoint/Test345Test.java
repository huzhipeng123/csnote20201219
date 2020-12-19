package com.leetcode.doublePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test345Test {

    @Test
    public void check(){
        Test345 test345 = new Test345();
        String s = "leetcode";
        String bz = "leotcede";
        String result = test345.reverseVowels(s);
        assert bz.equals(result);
    }

}