package com.leetcodetraining.leetcodetraining.service.binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Binary.MissingNumber.MissingNumberService;

@SpringBootTest
public class MissingNumberTests {
    @InjectMocks
    MissingNumberService missingNumberService;

    @Test
    void test_valid_input_should_return_correct_result() {
        // given
        int[] nums = {3,0,1};
        int expected = 2;

        // when
        int actual = missingNumberService.missingNumber(nums);

        // then
        assertEquals(expected, actual);
	}
}
