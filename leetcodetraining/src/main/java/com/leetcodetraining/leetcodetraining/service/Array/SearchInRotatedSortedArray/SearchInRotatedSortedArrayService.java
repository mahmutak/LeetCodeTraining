package com.leetcodetraining.leetcodetraining.service.Array.SearchInRotatedSortedArray;

import org.springframework.stereotype.Service;

@Service
public class SearchInRotatedSortedArrayService {
    public int search(int[] nums, int target) {
        if(nums == null) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if(nums[start] == target) {
                return start;
            }
            if(nums[end] == target) {
                return end;
            }
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            //left already sorted
            if(nums[mid] > nums[start]) {
                if (target > nums[start] && target < nums[mid]) {
                    end = mid-1;   
                }
                else {
                    start = mid+1;
                }
            }
            // left is not sorted but right must be sorted
            else {
                if (target > nums[mid] && target < nums[end]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
