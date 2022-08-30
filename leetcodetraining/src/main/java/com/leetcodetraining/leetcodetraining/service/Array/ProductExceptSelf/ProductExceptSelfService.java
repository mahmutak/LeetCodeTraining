package com.leetcodetraining.leetcodetraining.service.Array.ProductExceptSelf;

import org.springframework.stereotype.Service;

@Service
public class ProductExceptSelfService {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length < 2) {
            return nums;
        }
        int len = nums.length;
        int[] result = new int[len];
        result[0] = 1;
        for(int i = 1; i < len; i++) {
            result[i] = nums[i-1] * result[i-1];
        }
        int cumulative = nums[len - 1];
        for(int i = len - 2; i >= 0; i--) {
            result[i] *= cumulative;
            cumulative *= nums[i];
        }
        
        return result;
    }
}
