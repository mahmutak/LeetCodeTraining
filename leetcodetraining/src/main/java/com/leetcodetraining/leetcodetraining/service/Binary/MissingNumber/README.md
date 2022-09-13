# Missing Number
[Missing Number](https://leetcode.com/problems/missing-number/)

## Level
Easy

## Question
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


```bash
Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
```

Constraints:
```bash
n == nums.length
1 <= n <= 10^4
0 <= nums[i] <= n
All the numbers of nums are unique.
```
## Solution
Two different solution can be applied:
1- XOR
    a^b^b =a, which means two xor operations with the same number will eliminate the number and reveal the original number
2- SUM
    Sum of all elements + missing number = n * (n+1) / 2

## Usage

```bash
Swagger: POST /missingnumber
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[GPL](https://choosealicense.com/licenses/agpl-3.0/)