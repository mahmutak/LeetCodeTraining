package com.leetcodetraining.leetcodetraining.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leetcodetraining.leetcodetraining.service.TwoSumService;

import org.springframework.web.bind.annotation.RequestBody;;

@RestController
@RequestMapping("/")
public class LeetCodeController {

	@Autowired
	private TwoSumService twoSumService;

	@PostMapping("twosum")
	public int[] twoSum(@RequestBody int[] nums, @RequestParam int target) {
		return twoSumService.twoSum(nums, target);
	}

}