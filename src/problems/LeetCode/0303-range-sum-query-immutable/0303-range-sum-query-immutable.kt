class NumArray(nums: IntArray) {
    
    lateinit var pre: IntArray
    
    init {
        pre = IntArray(nums.size)
        pre[0] = nums[0]
        for (i in 1..nums.size-1) {
            pre[i] = pre[i-1] + nums[i]
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        if (left == 0) return pre[right]
        return pre[right] - pre[left-1]
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */