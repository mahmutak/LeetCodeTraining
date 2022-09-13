package com.leetcodetraining.leetcodetraining.service.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.DynamicProgramming.ClimbingStairs.ClimbingStairsService;

@SpringBootTest
public class ClimbingStairsTests {
    @InjectMocks
    ClimbingStairsService climbingStairsService;

    @Test
    void test_valid_input_should_return_correct_result() {
        // given
        int n = 3;
        int expected = 3;

        // when
        int actual = climbingStairsService.climbStairs(n);

        // then
        assertEquals(expected, actual);
	}
    
}
