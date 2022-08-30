package com.leetcodetraining.leetcodetraining.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.BuySellStock.BuyAndSellStockService;

@SpringBootTest
class BuyAndSellStockTests {
    @InjectMocks
    BuyAndSellStockService buyAndSellStockService;

	@Test
	void test_null_inputs_should_return_zero_result() {
        // given
        int[] prices = null;
        int expected = 0;

        // when
        int actual = buyAndSellStockService.maxProfit(prices);

        // then
        assertEquals(expected, actual);
	}

    @Test
	void test_valid_input_should_return_correct_result() {
        // given
        int[] prices = new int[]{7,1,5,3,6,4};
        int expected = 5;

        // when
        int actual = buyAndSellStockService.maxProfit(prices);

        // then
        assertEquals(expected, actual);
	}
}
