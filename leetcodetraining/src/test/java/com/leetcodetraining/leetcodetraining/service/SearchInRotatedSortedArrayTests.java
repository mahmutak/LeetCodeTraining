package com.leetcodetraining.leetcodetraining.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Array.SearchInRotatedSortedArray.SearchInRotatedSortedArrayService;


@SpringBootTest
class SearchInRotatedSortedArrayTests {
    @InjectMocks
    SearchInRotatedSortedArrayService searchInRotatedSortedArrayService;

	@Test
	void test_null_inputs_should_return_null_result() {
        // given
        int[] nums = null;
        int expected = -1;

        // when
        int actual = searchInRotatedSortedArrayService.search(nums, anyInt());

        // then
        assertEquals(expected, actual);
	}

    @Test
	void test_valid_input_with_missing_target_should_return_minus_one() {
        // given
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 3;
        int expected = -1;

        // when
        int actual = searchInRotatedSortedArrayService.search(nums, target);

        // then
        assertEquals(expected, actual);
	}


    @Test
	void test_valid_input_with_existing_target_should_return_correct_index() {
        // given
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        int expected = 4;

        // when
        int actual = searchInRotatedSortedArrayService.search(nums, target);

        // then
        assertEquals(expected, actual);
	}
}
