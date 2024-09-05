class Solution {

    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        nums.sort()
        return kSum(nums, target.toLong(), 0, 4)
    }

    fun kSum(
        nums: IntArray,
        target: Long,
        start: Int, k: Int
    ): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()

        if (start == nums.size) return answer

        val averageValue = target.div(k)

        if (nums[start] > averageValue || averageValue > nums.last()) return answer

        if (k == 2) return twoSum(nums = nums, target = target, start = start)

        for (i in start until nums.size) {
            if (i != start && nums[i - 1] == nums[i]) continue

            for (subset in kSum(nums = nums, target = target - nums[i], start = i + 1, k = k - 1)) {
                mutableListOf(nums[i]).also { it.addAll(subset) }.also(answer::add)
            }
        }

        return answer
    }

    fun twoSum(
        nums: IntArray,
        target: Long,
        start: Int
    ): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        var lo = start
        var hi = nums.size.minus(1)
        while (lo < hi) {
            val currentSum = nums[lo] + nums[hi]
            when {
                currentSum < target || (lo > start && nums[lo] == nums[lo - 1]) -> lo++
                currentSum > target || (hi < nums.size - 1 && nums[hi] == nums[hi + 1]) -> hi--
                else -> {
                    answer.add(listOf(nums[lo++], nums[hi--]))
                }
            }
        }
        return answer
    }

}