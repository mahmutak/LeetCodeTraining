package com.leetcodetraining.leetcodetraining.service.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Array.ContainsDublicate.ContainsDublicateService;

@SpringBootTest
class ContainsDublicateTests {
    @InjectMocks
    ContainsDublicateService containsDublicateService;

	@Test
	void test_null_inputs_should_return_zero_result() {
        // given
        int[] nums = null;
        boolean expected = false;

        // when
        boolean actual = containsDublicateService.containsDuplicate(nums);

        // then
        assertEquals(expected, actual);
	}

    @Test
	void test_valid_input_should_return_correct_result() {
        // given
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        boolean expected = true;

        // when
        boolean actual = containsDublicateService.containsDuplicate(nums);

        // then
        assertEquals(expected, actual);
	}
}
