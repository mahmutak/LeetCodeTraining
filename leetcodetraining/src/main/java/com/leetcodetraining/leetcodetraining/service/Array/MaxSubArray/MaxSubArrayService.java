package com.leetcodetraining.leetcodetraining.service.Array.MaxSubArray;

import org.springframework.stereotype.Service;

@Service
public class MaxSubArrayService {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        if(nums == null) {
            return curSum;
        }
        int maxSofar = Integer.MIN_VALUE;
        for(int num : nums) {
            curSum = Math.max(curSum+num, 0);
            if(curSum > 0) {
                maxSofar = Math.max(maxSofar, curSum);
            }
        }
        
        return maxSofar;
    }
}
