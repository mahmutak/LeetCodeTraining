package com.leetcodetraining.leetcodetraining.service.Array.FindMinInRotatedSortedArray;

import org.springframework.stereotype.Service;

@Service
public class FindMinInRotatedSortedArrayService {
    public int findMin(int[] nums) {
        if(nums == null) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        int currMin = nums[0];
        while (start <= end) {
            if(nums[start] < nums[end]) {
                currMin = Math.min(currMin, nums[start]);
                break;
            }
            int mid = (start + end) / 2;
            currMin = Math.min(currMin, nums[mid]);
            if(nums[mid] < nums[start]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return currMin;
    }
}
