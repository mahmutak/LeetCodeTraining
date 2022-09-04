package com.leetcodetraining.leetcodetraining.service.Binary.SumOfTwoInteger;

import org.springframework.stereotype.Service;

@Service
public class SumOfTwoIntegerService {
    public int getSum(int a, int b) {
        //a = 3 -> 0011
        //b = 5 -> 0101
        //s = 8 -> 1000
        return b==0? a:getSum(a^b, (a&b)<<1);
        //(6+2), 0110, 0010
        //(4+4), 0100, 0100
        //(0+8), 0000, 1000
    }
}
