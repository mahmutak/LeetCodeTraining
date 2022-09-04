package com.leetcodetraining.leetcodetraining.service.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Array.ContainerWithMostWater.ContainerWithMostWaterService;

@SpringBootTest
class ContainerWithMostWaterTests {
    @InjectMocks
    ContainerWithMostWaterService containerWithMostWaterService;

    @Test
	void test_valid_input_should_return_correct_result() {
        // given
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int expected = 49;

        // when
        int actual = containerWithMostWaterService.maxArea(height);

        // then
        assertEquals(expected, actual);
	}

}
