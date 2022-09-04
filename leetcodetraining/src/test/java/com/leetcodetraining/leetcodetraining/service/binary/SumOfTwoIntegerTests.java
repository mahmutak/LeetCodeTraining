package com.leetcodetraining.leetcodetraining.service.binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Binary.SumOfTwoInteger.SumOfTwoIntegerService;

@SpringBootTest
class SumOfTwoIntegerTests {
    @InjectMocks
    SumOfTwoIntegerService sumOfTwoIntegerService;

    @Test
	void test_valid_input_should_return_correct_result() {
        // given
        int a = 3;
        int b = 5;
        int expected = a + b;

        // when
        int actual = sumOfTwoIntegerService.getSum(a, b);

        // then
        assertEquals(expected, actual);
	}
    
}
