package com.leetcode.doublePoint;

import static org.junit.jupiter.api.Assertions.*;

class Test680Test {

    public void check(){
        Test680 test680 = new Test680();
        String s = "abca";
        boolean result = test680.validPalindrome(s);
        assert result == true;
    }

}