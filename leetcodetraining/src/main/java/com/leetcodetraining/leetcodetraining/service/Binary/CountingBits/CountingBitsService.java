package com.leetcodetraining.leetcodetraining.service.Binary.CountingBits;

import org.springframework.stereotype.Service;

@Service
public class CountingBitsService {
    public int[] countBits(int n) {
        int[] f = new int[n + 1];
        for (int i=1; i<=n; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }

    public int[] countBitsAlternative(int num) {
        int[] setBits = new int[num + 1];
        setBits[0] = 0;
        if(num < 1)
            return setBits;
        setBits[1] = 1;
        for (int i = 2; i <= num; i++)  
        { 
            // If current element i is even then 
            // it has set bits equal to the count 
            // of the set bits in i / 2 
            if (i % 2 == 0)  
            { 
                setBits[i] = setBits[i / 2]; 
            } 

            // Else it has set bits equal to one 
            // more than the previous element 
            else
            { 
                setBits[i] = setBits[i - 1] + 1; 
            } 
        }
        return setBits;
    }
}
