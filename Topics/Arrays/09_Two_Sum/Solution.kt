class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        var buffer = 0

        for (i in nums.indices) {
            buffer = target - nums[i]

            if(hashMap.containsKey(buffer)) {
                return intArrayOf(hashMap[buffer]!!, i)
            }

            hashMap.put(nums[i] , i)
        }

        throw IllegalArgumentException("No solution found")
    }
}
