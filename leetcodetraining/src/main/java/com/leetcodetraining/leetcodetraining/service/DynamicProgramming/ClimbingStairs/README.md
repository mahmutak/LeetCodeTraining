# Climbing Stairs
[Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

## Level
Easy

## Question
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

```bash
Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```

Constraints:
```bash
1 <= n <= 45
```
## Solution
    We can use recursive approach climbStair(n - 1) + climbStair(n - 2) by saving results into cache.

## Usage

```bash
Swagger: POST /climbstairs
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[GPL](https://choosealicense.com/licenses/agpl-3.0/)