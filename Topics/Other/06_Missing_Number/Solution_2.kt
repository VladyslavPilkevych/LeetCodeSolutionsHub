class Solution_2 {
    fun missingNumber(nums: IntArray): Int {
        val maxLength = nums.size
        val expectedSum = maxLength * (maxLength + 1) / 2
        val actualSum = nums.sum()

        return expectedSum - actualSum
    }
}
