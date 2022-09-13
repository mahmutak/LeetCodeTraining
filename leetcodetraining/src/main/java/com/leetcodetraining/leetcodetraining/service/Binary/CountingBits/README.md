# Counting Bits
[Counting Bits](https://leetcode.com/problems/counting-bits/)

## Level
Easy

## Question
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

```bash
Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
```

Constraints:
```bash
0 <= n <= 10^5
```
## Solution
When it comes to even numbers, i.e, 2,4,6,8, their binary should be like '10', '100', '110', '1000' so one notable difference is their unit digit is always 0, which means when you call >> 1- shift one bit rightwards and also means dividing by 2- would cause no change to the count of '1' in the binary string.

Vice versa, when you meet odd numbers, shifting one bit rightwards always eliminates one '1' digit from original binary string, that is why we should "compensate" one '1' character to the count.

To sum up, when you meet even number the count of '1's is always the same as its half number, on the other hand, remember to plus one to the odds' half number.

[General approach](https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary%3A-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently)

[Bitwise Operation](https://en.wikipedia.org/wiki/Bitwise_operation)

[Hamming weight](https://en.wikipedia.org/wiki/Hamming_weight)

## Usage

```bash
Swagger: POST /countbits
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[GPL](https://choosealicense.com/licenses/agpl-3.0/)