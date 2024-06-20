class SparseVector(val nums: IntArray) {
    fun dotProduct(vec: SparseVector): Int = 
        nums.zip(vec.nums).fold(0) { ac, p -> ac + (p.first * p.second) }
}

/**
 * Your SparseVector object will be instantiated and called as such:
 * var v1 = SparseVector(nums1)
 * var v2 = SparseVector(nums2)
 * val ans = v1.dotProduct(v2)
 */