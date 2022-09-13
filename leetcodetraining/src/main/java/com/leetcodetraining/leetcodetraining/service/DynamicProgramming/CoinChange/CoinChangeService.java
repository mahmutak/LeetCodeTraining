package com.leetcodetraining.leetcodetraining.service.DynamicProgramming.CoinChange;

import java.util.HashMap;
import java.util.Map;

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
    
    // memoization
    Map<Integer,Integer> map = new HashMap<>();
    public int coinChangeMemoization(int[] coins, int amount) {
       
        if(amount<0) return -1;
        if(amount==0) return 0;
        Integer c=map.get(amount);
        if(c!=null) return c;
        int cc=-1;
        for(int i=0;i<coins.length;i++) {
            int coin=coinChangeMemoization(coins, amount-coins[i]);
            if(coin>=0) cc=cc<0?coin+1:Math.min(cc,coin+1);
        }
        map.put(amount,cc);
        return cc;
    }
}
