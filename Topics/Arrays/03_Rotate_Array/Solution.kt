class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val steps = k % nums.size

        if (steps == 0) return

        val temp = IntArray(nums.size)

        for (i in 0 until steps) {
            temp[i] = nums[nums.size - steps + i]
        }

        for (i in steps until nums.size) {
            temp[i] = nums[i - steps]
        }

        for (i in nums.indices) {
            nums[i] = temp[i]
        }
    }
}
