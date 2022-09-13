package com.leetcodetraining.leetcodetraining.service.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.DynamicProgramming.CoinChange.CoinChangeService;

@SpringBootTest
public class CoinChangeTests {
    @InjectMocks
    CoinChangeService coinChangeService;

    @Test
    void test_valid_input_should_return_correct_result() {
        // given
        int[] coins = {1,2,5};
        int amount = 11;
        int expected = 3;

        // when
        int actual = coinChangeService.coinChange(coins, amount);

        // then
        assertEquals(expected, actual);
	}
}
