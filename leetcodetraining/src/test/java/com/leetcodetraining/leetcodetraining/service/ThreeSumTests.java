package com.leetcodetraining.leetcodetraining.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Array.ThreeSum.ThreeSumService;

@SpringBootTest
class ThreeSumTests {
    @InjectMocks
    ThreeSumService threeSumService;

	@Test
	void test_valid_inputs_should_return_empty_result_when_there_is_no_match() {
        // given
        int[] nums = {0,1,1};
        List<List<Integer>> expected = new ArrayList<>();

        // when
        List<List<Integer>> actual = threeSumService.threeSum(nums);

        // then
        assertEquals(expected.size(), actual.size());
	}

    @Test
	void test_valid_inputs_should_return_correct_result_when_there_is_match() {
        // given
        int[] nums = {0,1,-1};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1,0,1));

        // when
        List<List<Integer>> actual = threeSumService.threeSum(nums);

        // then
        assertEquals(expected.size(), actual.size());
        boolean result = expected.stream()
            .allMatch(p -> actual.stream()
            .anyMatch(q -> Arrays.deepEquals(q.toArray(), p.toArray())));
        assertTrue(result);
	}
}