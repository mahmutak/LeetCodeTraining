package com.leetcodetraining.leetcodetraining.service.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Array.MaxProductSubArray.MaxProductSubArrayService;

@SpringBootTest
class MaxProductSubArrayTests {
    @InjectMocks
    MaxProductSubArrayService maxProductSubArrayService;

	@Test
	void test_null_inputs_should_return_null_result() {
        // given
        int[] nums = null;
        int expected = 0;

        // when
        int actual = maxProductSubArrayService.maxProduct(nums);

        // then
        assertEquals(expected, actual);
	}

    @Test
	void test_valid_input_should_return_correct_result() {
        // given
        int[] nums = new int[]{2,3,-2,4};
        int expected = 6;

        // when
        int actual = maxProductSubArrayService.maxProduct(nums);

        // then
        assertEquals(expected, actual);
	}
}
