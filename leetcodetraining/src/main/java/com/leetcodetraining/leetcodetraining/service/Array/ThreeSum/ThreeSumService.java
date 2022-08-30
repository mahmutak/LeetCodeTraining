package com.leetcodetraining.leetcodetraining.service.Array.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ThreeSumService {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retVal = new ArrayList();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < len; i++) {
            //skip duplicate
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            //break if there will be no negative element 
            if(nums[i] > 0) {
                break;
            }
            int j = i+1;
            int k = len-1;
            // use two pointer
            while(j < k) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    retVal.add(List.of(nums[i], nums[j], nums[k]));
                    ++j;
                    // if j duplicate, skip
                    while(j < k && nums[j] == nums[j-1]) ++j;
                } else if(nums[i] + nums[j] + nums[k] < 0) {
                    ++j;
                } else {
                    --k;
                }
            }
        }
        return retVal;
    }
}
