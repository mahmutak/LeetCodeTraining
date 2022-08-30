# Two Sum
[product-of-array-except-self](https://leetcode.com/problems/product-of-array-except-self/)

## Level
Medium

## Question
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
```bash
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

Constraints:
```bash
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
```
## Solution

Straight forward solution works for this question. Iterate from 1st index by multiplying nums[i-1] with result[i-1].
Then iterate from nums[len-2] till 0 index.


## Usage

```bash
Swagger: POST /productexceptself
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[GPL](https://choosealicense.com/licenses/agpl-3.0/)