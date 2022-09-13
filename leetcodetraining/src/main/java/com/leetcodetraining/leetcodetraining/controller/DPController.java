package com.leetcodetraining.leetcodetraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leetcodetraining.leetcodetraining.service.DynamicProgramming.ClimbingStairs.ClimbingStairsService;

@RestController
@RequestMapping("dp/")
public class DPController {
    @Autowired
    ClimbingStairsService climbingStairsService;

    @PostMapping("climbstairs")
    public int climbStairs(@RequestParam int n) {
        return climbingStairsService.climbStairs(n);
    }
}
