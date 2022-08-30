package com.leetcodetraining.leetcodetraining.service.Array.BuySellStock;

import org.springframework.stereotype.Service;

@Service
public class BuyAndSellStockService {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices == null || prices.length == 0) {
            return result;
        }
        int currentMin = Integer.MAX_VALUE;
        for(int price : prices) {
            if (currentMin > price) {
                currentMin = price;
            }
            else {
                result = Math.max(result, price - currentMin);
            }
        }
        return result;
    }
}
