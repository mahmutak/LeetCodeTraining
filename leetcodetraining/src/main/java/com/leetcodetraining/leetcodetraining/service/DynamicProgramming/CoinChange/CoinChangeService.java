package com.leetcodetraining.leetcodetraining.service.DynamicProgramming.CoinChange;

import org.springframework.stereotype.Service;

@Service
public class CoinChangeService {
    //DP solution
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)
            return 0;
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1; i <= amount; ++i){
            dp[i] = Integer.MAX_VALUE;
            for(int c : coins){
                if(i >= c && dp[i-c] < dp[i]){
                    dp[i] = dp[i - c]+1;
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
