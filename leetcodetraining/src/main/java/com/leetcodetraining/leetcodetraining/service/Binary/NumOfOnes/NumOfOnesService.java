package com.leetcodetraining.leetcodetraining.service.Binary.NumOfOnes;

import org.springframework.stereotype.Service;

@Service
public class NumOfOnesService {
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0) {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
