class Solution {
    fun missingNumber(nums: IntArray): Int {
        val maxLength = nums.size + 1

        val hashMap = HashMap<Int, Int>(maxLength)

        for (i in 0 until maxLength) {
            hashMap[i] = 0
        }

        for (num in nums) {
            hashMap.put(num, 1)
        }

        for (num in 0 until maxLength) {
            if(hashMap.getOrDefault(num, 0) !== 1) {
                return num
            }
        }

        return maxLength
    }
}
