package com.leetcodetraining.leetcodetraining.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Array.FindMinInRotatedSortedArray.FindMinInRotatedSortedArrayService;

@SpringBootTest
class FindMinInRotatedSortedArrayTests {
    @InjectMocks
    FindMinInRotatedSortedArrayService findMinInRotatedSortedArrayService;

	@Test
	void test_null_inputs_should_return_null_result() {
        // given
        int[] nums = null;
        int expected = 0;

        // when
        int actual = findMinInRotatedSortedArrayService.findMin(nums);

        // then
        assertEquals(expected, actual);
	}

    @Test
	void test_valid_input_should_return_correct_result() {
        // given
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int expected = 0;

        // when
        int actual = findMinInRotatedSortedArrayService.findMin(nums);

        // then
        assertEquals(expected, actual);
	}
}
