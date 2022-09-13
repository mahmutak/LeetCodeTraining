package com.leetcodetraining.leetcodetraining.service.Binary.MissingNumber;

import org.springframework.stereotype.Service;

@Service
public class MissingNumberService {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int res = 0;
        for(int i = 0; i < len; i++) {
            res ^= i ^ nums[i];
        }
        
        return res ^ len;
    }

    public int missingNumberWithSum(int[] nums) {
        int len = nums.length;
        int total = (len * (len + 1)) / 2;
        int curr = 0;
        for(int elem : nums){
            curr += elem;
        }
        return total - curr;
    }
}
