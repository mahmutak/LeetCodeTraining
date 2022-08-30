package com.leetcodetraining.leetcodetraining.service.Array.ContainsDublicate;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class ContainsDublicateService {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> uniqueSet = new HashSet<>();
        for(int num : nums) {
            if (uniqueSet.contains(num)) {
                return true;
            }
            uniqueSet.add(num);
        }
        return false;
    }
}
