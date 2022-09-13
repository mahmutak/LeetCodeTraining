package com.leetcodetraining.leetcodetraining.service.Binary.NumOfOnes;

import org.springframework.stereotype.Service;

@Service
public class NumOfOnesService {
    public int hammingWeight(int i) {
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        return i & 0x3f;
    }
}
