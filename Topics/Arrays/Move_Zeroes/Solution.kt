class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var lastNonZeroIndex = 0
        for(i in nums.indices) {
            if(nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i]
                lastNonZeroIndex++
            }
        }
        for(i in lastNonZeroIndex until nums.size ) {
            nums[i] = 0
        }
    }
}
