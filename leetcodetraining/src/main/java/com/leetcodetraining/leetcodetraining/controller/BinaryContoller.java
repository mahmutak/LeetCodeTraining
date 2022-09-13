package com.leetcodetraining.leetcodetraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leetcodetraining.leetcodetraining.service.Binary.CountingBits.CountingBitsService;
import com.leetcodetraining.leetcodetraining.service.Binary.MissingNumber.MissingNumberService;
import com.leetcodetraining.leetcodetraining.service.Binary.NumOfOnes.NumOfOnesService;
import com.leetcodetraining.leetcodetraining.service.Binary.ReverseBits.ReverseBitsService;
import com.leetcodetraining.leetcodetraining.service.Binary.SumOfTwoInteger.SumOfTwoIntegerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("binary/")
public class BinaryContoller {
    @Autowired
    SumOfTwoIntegerService sumOfTwoIntegerService;

    @Autowired
    NumOfOnesService numOfOnesService;

    @Autowired
    CountingBitsService countingBitsService;

    @Autowired
    MissingNumberService missingNumberService;

    @Autowired
    ReverseBitsService reverseBitsService;

    @PostMapping("gettwosum")
	public int twoSum(@RequestParam int a, @RequestParam int b) {
		return sumOfTwoIntegerService.getSum(a, b);
	}

    @PostMapping("hammingweight")
    public int hammingWeight(@RequestParam int n) {
        return numOfOnesService.hammingWeight(n);
    }
    
    @PostMapping("countbits")
    public int[] countingBits(@RequestParam int n) {
        return countingBitsService.countBits(n);
    }

    @PostMapping("missingnumber")
    public int missingNumber(@RequestBody int[] nums) {
        return missingNumberService.missingNumber(nums);
    }

    @PostMapping("reversebits")
    public int reverseBits(@RequestParam int n) {
        return reverseBitsService.reverseBits(n);
    }
}
