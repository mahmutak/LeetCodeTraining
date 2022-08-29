package com.leetcodetraining.leetcodetraining.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TwoSumTests {
    @InjectMocks
    TwoSumService twoSumService;

	@Test
	void test_null_inputs_should_return_empty_result() {
        // given
        int[] nums = null;
        int target = 0;
        int[] expected = new int[2];

        // when
        int[] actual = twoSumService.twoSum(nums, target);

        // then
        assertArrayEquals(expected, actual);
	}

    @Test
	void test_invalid_target_should_return_empty_result() {
        // given
        int[] nums = new int[]{1,2,3};
        int target = 0;
        int[] expected = new int[2];

        // when
        int[] actual = twoSumService.twoSum(nums, target);

        // then
        assertArrayEquals(expected, actual);
	}

    @Test
	void test_valid_target_should_return_correct_result() {
        // given
        int[] nums = new int[]{1,2,3};
        int target = 4;
        int[] expected = new int[]{0,2};

        // when
        int[] actual = twoSumService.twoSum(nums, target);

        // then
        assertArrayEquals(expected, actual);
	}
}
