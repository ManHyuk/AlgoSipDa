import kotlin.math.max
import kotlin.math.min

class Solution {
    data class MaxMin(val max1: Int, val max2: Int, val min1: Int, val min2: Int)
    fun maxProductDifference(nums: IntArray): Int {
        val mm = nums.fold(MaxMin(Int.MIN_VALUE, Int.MIN_VALUE, Int.MAX_VALUE, Int.MAX_VALUE)) {
                        mm, num -> MaxMin(
                                      max(num, mm.max1), if (num > mm.max1) mm.max1 else max(num, mm.max2),
                                      min(num, mm.min1), if (num < mm.min1) mm.min1 else min(num, mm.min2)
                                   )
                        }
        return mm.max1 * mm.max2 - mm.min1 * mm.min2
    }
}