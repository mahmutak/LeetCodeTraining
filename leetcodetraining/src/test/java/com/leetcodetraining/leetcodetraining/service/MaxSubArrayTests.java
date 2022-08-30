package com.leetcodetraining.leetcodetraining.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Array.MaxSubArray.MaxSubArrayService;

@SpringBootTest
class MaxSubArrayTests {
    @InjectMocks
    MaxSubArrayService maxSubArrayService;

	@Test
	void test_null_inputs_should_return_null_result() {
        // given
        int[] nums = null;
        int expected = 0;

        // when
        int actual = maxSubArrayService.maxSubArray(nums);

        // then
        assertEquals(expected, actual);
	}

    @Test
	void test_valid_input_should_return_correct_result() {
        // given
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;

        // when
        int actual = maxSubArrayService.maxSubArray(nums);

        // then
        assertEquals(expected, actual);
	}
}
