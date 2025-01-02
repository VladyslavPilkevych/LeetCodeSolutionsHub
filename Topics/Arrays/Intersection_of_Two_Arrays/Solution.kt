class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap = HashMap<Int, Int>()
        val resultList = mutableListOf<Int>()

        for (num in nums1) {
            hashMap.put(num , hashMap.getOrDefault(num, 0) + 1)
        }

        for (num in nums2) {
            if(hashMap.getOrDefault(num, 0) > 0) {
                resultList.add(num)
                hashMap.put(num , hashMap[num]!! - 1)
            }
        }
        return resultList.toIntArray()
    }
}
