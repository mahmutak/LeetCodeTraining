package com.leetcodetraining.leetcodetraining.service.binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.leetcodetraining.leetcodetraining.service.Binary.ReverseBits.ReverseBitsService;

@SpringBootTest
public class ReverseBitsTests {
    @InjectMocks
    ReverseBitsService reverseBitsService;

    @Test
    void test_valid_input_should_return_correct_result() {
        // given
        int n = 43261596;
        int expected = 964176192;

        // when
        int actual = reverseBitsService.reverseBits(n);

        // then
        assertEquals(expected, actual);
	} 

}
