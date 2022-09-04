package com.leetcodetraining.leetcodetraining.service.binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Binary.NumOfOnes.NumOfOnesService;

@SpringBootTest
class NumOfOnesTests {
    @InjectMocks
    NumOfOnesService numOfOnesService;
    
    @Test
    void test_valid_input_should_return_correct_result() {
        // given
        int n = 00000000000000000000000000001011;
        int expected = 3;

        // when
        int actual = numOfOnesService.hammingWeight(n);

        // then
        assertEquals(expected, actual);
	}
}
