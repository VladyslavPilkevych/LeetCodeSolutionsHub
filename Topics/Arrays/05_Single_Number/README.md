## Problem: Single Number

### Problem Description
[Link to the problem](https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/)

Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

### Example 1:
Input: `nums = [2,2,1]`

Output: `1`

### Example 2:

Input: `nums = [4,1,2,1,2]`

Output: `4`

### Example 3:

Input: `nums = [1]`

Output: `1`

## Constraints:

- `1 <= nums.length <= 3 * 104`
- `-3 * 104 <= nums[i] <= 3 * 104`
- Each element in the array appears twice except for one element which appears only once.

## Solution

```kotlin
class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }
}
```

## How It Works

### Process:
1. Start with `result = 0`
2. Iterate through the array and XOR all numbers.
3. Numbers that appear twice cancel out, leaving only the single number.

### Example:
- **Input**: `nums = [4, 1, 2, 1, 2]`
- **Steps**:
    - \( 0 ⊕ 4 = 4 \)
    - \( 4 ⊕ 1 = 5 \)
    - \( 5 ⊕ 2 = 7 \)
    - \( 7 ⊕ 1 = 6 \)
    - \( 6 ⊕ 2 = 4 \)
- **Output**: `4`

### Complexity:
- **Time Complexity**: \( O(n) \) — Single pass through the array.
- **Space Complexity**: \( O(1) \) — Only one variable (`result`) is used.
