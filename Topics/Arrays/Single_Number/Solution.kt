class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }
}


//class Solution {
//    fun singleNumber(nums: IntArray): Int {
//        if (nums.size == 1) return nums[0]
//        nums.sort()
//        for (i in nums.indices step 2) {
//        if (i + 1 == nums.size || nums[i] != nums[i + 1]) {
//        return nums[i]
//    }
//}
