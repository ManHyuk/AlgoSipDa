class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val indexToFind = nums.size - k
        quickSort(nums, 0, nums.size - 1)
        return nums[indexToFind]
    }

    private fun quickSort(array: IntArray, left: Int, right: Int) {
        if (left < right) {
            val partitionIdx = partition(array, left, right)
            quickSort(array, left, partitionIdx - 1)
            quickSort(array, partitionIdx + 1, right)
        }
    }

    private fun partition(array: IntArray, left: Int, right: Int): Int {
        val pivotElement = array[right];
        var partitionIndex = left;

        for (j in left..< right) {
            if (array[j] < pivotElement) {
                swap(array, partitionIndex, j)
                partitionIndex++
            }
        }
        swap(array, partitionIndex, right)
        return partitionIndex
    }

    private fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}