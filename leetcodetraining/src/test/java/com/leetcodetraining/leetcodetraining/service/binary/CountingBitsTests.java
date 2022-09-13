package com.leetcodetraining.leetcodetraining.service.binary;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Binary.CountingBits.CountingBitsService;

@SpringBootTest
class CountingBitsTests {
    @InjectMocks
    CountingBitsService countingBitsService;
    
    @Test
    void test_valid_input_should_return_correct_result() {
        // given
        int n = 5;
        int[] expected = {0,1,1,2,1,2};

        // when
        int[] actual = countingBitsService.countBits(n);

        // then
        assertArrayEquals(expected, actual);
	}
}
