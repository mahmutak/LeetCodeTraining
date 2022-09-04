package com.leetcodetraining.leetcodetraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leetcodetraining.leetcodetraining.service.Array.BuySellStock.BuyAndSellStockService;
import com.leetcodetraining.leetcodetraining.service.Array.ContainerWithMostWater.ContainerWithMostWaterService;
import com.leetcodetraining.leetcodetraining.service.Array.ContainsDublicate.ContainsDublicateService;
import com.leetcodetraining.leetcodetraining.service.Array.FindMinInRotatedSortedArray.FindMinInRotatedSortedArrayService;
import com.leetcodetraining.leetcodetraining.service.Array.MaxProductSubArray.MaxProductSubArrayService;
import com.leetcodetraining.leetcodetraining.service.Array.MaxSubArray.MaxSubArrayService;
import com.leetcodetraining.leetcodetraining.service.Array.ProductExceptSelf.ProductExceptSelfService;
import com.leetcodetraining.leetcodetraining.service.Array.SearchInRotatedSortedArray.SearchInRotatedSortedArrayService;
import com.leetcodetraining.leetcodetraining.service.Array.ThreeSum.ThreeSumService;
import com.leetcodetraining.leetcodetraining.service.Array.TwoSum.TwoSumService;

import org.springframework.web.bind.annotation.RequestBody;;

@RestController
@RequestMapping("array/")
public class ArrayController {

	@Autowired
	private TwoSumService twoSumService;

	@Autowired
	private BuyAndSellStockService buyAndSellStockService;

	@Autowired
	private ContainsDublicateService containsDublicateService;

	@Autowired
	private ProductExceptSelfService productExceptSelfService;

	@Autowired 
	private MaxSubArrayService maxSubArrayService;

	@Autowired
	private MaxProductSubArrayService maxProductSubArrayService;

	@Autowired
	private FindMinInRotatedSortedArrayService findMinInRotatedSortedArrayService;

	@Autowired
	private SearchInRotatedSortedArrayService searchInRotatedSortedArrayService;

	@Autowired
	private ThreeSumService threeSumService;

	@Autowired
	private ContainerWithMostWaterService containerWithMostWaterService;

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

	@PostMapping("productexceptself")
	public int[] productExceptSelf(@RequestBody int[] nums) {
		return productExceptSelfService.productExceptSelf(nums);
	}

	@PostMapping("maxsubarray")
	public int maxSubArray(@RequestBody int[] nums) {
		return maxSubArrayService.maxSubArray(nums);
	}

	@PostMapping("maxproduct")
	public int maxProduct(@RequestBody int[] nums) {
        return maxProductSubArrayService.maxProduct(nums);
    }

	@PostMapping("findmininrotatedsortedarray")
	public int findMinInRotatedSortedArray(@RequestBody int[] nums) {
        return findMinInRotatedSortedArrayService.findMin(nums);
    }

	@PostMapping("searchinrotatedsortedarray")
	public int searchInRotatedSortedArray(@RequestBody int[] nums, @RequestBody int target) {
        return searchInRotatedSortedArrayService.search(nums, target);
    }

	@PostMapping("threesum")
	public List<List<Integer>> threesum(@RequestBody int[] nums) {
		return threeSumService.threeSum(nums);
	}

	@PostMapping("maxarea")
	public int maxarea(@RequestBody int[] height) {
		return containerWithMostWaterService.maxArea(height);
	}
}