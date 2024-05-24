class Solution {
    fun maxArea(height: IntArray): Int {
        var (l, r) = 0 to height.size - 1
        var max = 0       

        while (l < r) {
            val area = minOf(height[r], height[l]) * (r - l)
            max = maxOf(area, max)

            if (height[l] < height[r]) l++
            else r--
        }
        
        return max
    }
}