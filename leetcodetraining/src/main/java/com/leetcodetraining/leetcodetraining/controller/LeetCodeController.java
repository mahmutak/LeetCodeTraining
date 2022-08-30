package com.leetcodetraining.leetcodetraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leetcodetraining.leetcodetraining.service.Array.BuySellStock.BuyAndSellStockService;
import com.leetcodetraining.leetcodetraining.service.Array.ContainsDublicate.ContainsDublicateService;
import com.leetcodetraining.leetcodetraining.service.Array.ProductExceptSelf.ProductExceptSelfService;
import com.leetcodetraining.leetcodetraining.service.Array.TwoSum.TwoSumService;

import org.springframework.web.bind.annotation.RequestBody;;

@RestController
@RequestMapping("/")
public class LeetCodeController {

	@Autowired
	private TwoSumService twoSumService;

	@Autowired
	private BuyAndSellStockService buyAndSellStockService;

	@Autowired
	private ContainsDublicateService containsDublicateService;

	@Autowired
	private ProductExceptSelfService productExceptSelfService;

	@PostMapping("twosum")
	public int[] twoSum(@RequestBody int[] nums, @RequestParam int target) {
		return twoSumService.twoSum(nums, target);
	}

	@PostMapping("maxprofit")
	public int maxprofit(@RequestBody int[] prices) {
		return buyAndSellStockService.maxProfit(prices);
	}

	@PostMapping("containsduplicate")
	public boolean containsDuplicate(@RequestBody int[] nums) {
		return containsDublicateService.containsDuplicate(nums);
	}

	@PostMapping("productExceptSelf")
	public int[] productExceptSelf(@RequestBody int[] nums) {
		return productExceptSelfService.productExceptSelf(nums);
	}
}