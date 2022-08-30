package com.leetcodetraining.leetcodetraining.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Array.ProductExceptSelf.ProductExceptSelfService;

@SpringBootTest
class ProductExceptSelfTests {
    @InjectMocks
    ProductExceptSelfService productExceptSelfService;

	@Test
	void test_null_inputs_should_return_null_result() {
        // given
        int[] nums = null;
        int[] expected = null;

        // when
        int[] actual = productExceptSelfService.productExceptSelf(nums);

        // then
        assertArrayEquals(expected, actual);
	}

    @Test
	void test_valid_input_should_return_correct_result() {
        // given
        int[] nums = new int[]{-1,1,0,-3,3};
        int[] expected = new int[]{0,0,9,0,0};

        // when
        int[] actual = productExceptSelfService.productExceptSelf(nums);

        // then
        assertArrayEquals(expected, actual);
	}
}
