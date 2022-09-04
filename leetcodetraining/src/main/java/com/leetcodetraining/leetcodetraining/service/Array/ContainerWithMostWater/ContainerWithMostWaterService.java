package com.leetcodetraining.leetcodetraining.service.Array.ContainerWithMostWater;

import org.springframework.stereotype.Service;

@Service
public class ContainerWithMostWaterService {
    public int maxArea(int[] height) {
        int n = height.length;
        int MAX_AREA = 0;
        for(int i = 0, j = n - 1; i < j; ){
            if(height[i] >= height[j]){
                MAX_AREA = Math.max(MAX_AREA, height[j] * (j - i));
                j--;
            }
            else{
                MAX_AREA = Math.max(MAX_AREA, height[i] * (j - i));
                i++;
            }
        }
        return MAX_AREA;
    }
}