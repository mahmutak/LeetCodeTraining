package com.leetcodetraining.leetcodetraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leetcodetraining.leetcodetraining.service.Binary.NumOfOnes.NumOfOnesService;
import com.leetcodetraining.leetcodetraining.service.Binary.SumOfTwoInteger.SumOfTwoIntegerService;


@RestController
@RequestMapping("binary/")
public class BinaryContoller {
    @Autowired
    SumOfTwoIntegerService sumOfTwoIntegerService;

    @Autowired
    NumOfOnesService numOfOnesService;

    @PostMapping("gettwosum")
	public int twoSum(@RequestParam int a, @RequestParam int b) {
		return sumOfTwoIntegerService.getSum(a, b);
	}

    @PostMapping("hammingweight")
    public int hammingWeight(@RequestParam int n) {
        return numOfOnesService.hammingWeight(n);
    }
    
}
