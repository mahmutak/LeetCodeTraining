package com.leetcodetraining.leetcodetraining.service.DynamicProgramming.ClimbingStairs;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ClimbingStairsService {
    Map<Integer, Integer> stairsCache = new HashMap<>();
    public int climbStairs(int n) {
        if(n <= 2)
            return n;
        if(stairsCache.containsKey(n)){
            return stairsCache.get(n);
        }
        int oneStep = climbStairs(n - 1);
        int twoStep = climbStairs(n - 2);
        int total = oneStep + twoStep;
        stairsCache.put(n, total);
        return total;
    }
}
