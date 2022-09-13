package com.leetcodetraining.leetcodetraining.service.Binary.ReverseBits;

import org.springframework.stereotype.Service;

@Service
public class ReverseBitsService {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            res= ( res << 1 ) | ( n & 1 );         
            n = n >> 1;                  
        }
        return res;
    }

    /***
     * Another solution from discussions
     * https://leetcode.com/problems/reverse-bits/discuss/1232842/JAVA-C%2B%2B-%3A-0ms-or-O(1)-Time-Complexity-or-in-place-or-Detailed-Explanation
     */

    public int reverseBitsByRotate(int num) {
        
        num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
        num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
        num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);
        num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);
        num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);
        
        return num;
        
    }

}
