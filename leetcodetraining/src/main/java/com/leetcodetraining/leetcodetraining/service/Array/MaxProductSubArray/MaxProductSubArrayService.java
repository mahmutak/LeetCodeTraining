package com.leetcodetraining.leetcodetraining.service.Array.MaxProductSubArray;

import org.springframework.stereotype.Service;

@Service
public class MaxProductSubArrayService {
    public int maxProduct(int[] nums) {
        if(nums == null) {
            return 0;
        }
        int max = 1, min = 1;
        int result = nums[0];
        for(int i = 0; i < nums.length; i++) {
            int maxTemp = max;
            max = Math.max(max*nums[i], min*nums[i]);
            max = Math.max(max, nums[i]);
            
            min = Math.min(maxTemp*nums[i], min*nums[i]);
            min = Math.min(min, nums[i]);
            result = Math.max(result,max);
            
        }
        
        return result;
    }
}
