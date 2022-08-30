package com.leetcodetraining.leetcodetraining.service.TwoSum;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TwoSumService {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remainIndex = new HashMap<>();
        int[] result = new int[2];
        
        if (nums == null) {
            return result;
        }
        for(int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            int remIndex = remainIndex.getOrDefault(nums[i], -1);
            if(remIndex >= 0) {
                result[0] = remIndex;
                result[1] = i;
                return result;
            }
            else {
                remainIndex.put(remain, i);
            }
        }
        return result;
	}
}
