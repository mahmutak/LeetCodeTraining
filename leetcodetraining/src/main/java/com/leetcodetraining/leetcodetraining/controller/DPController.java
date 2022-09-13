package com.leetcodetraining.leetcodetraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leetcodetraining.leetcodetraining.service.DynamicProgramming.ClimbingStairs.ClimbingStairsService;
import com.leetcodetraining.leetcodetraining.service.DynamicProgramming.CoinChange.CoinChangeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("dp/")
public class DPController {
    @Autowired
    ClimbingStairsService climbingStairsService;

    @Autowired
    CoinChangeService coinChangeService;

    @PostMapping("climbstairs")
    public int climbStairs(@RequestParam int n) {
        return climbingStairsService.climbStairs(n);
    }

    @PostMapping("coinchange")
    public int coinChange(@RequestBody int[] coins, @RequestParam int amount) {
        return coinChange(coins, amount);
    }
}
