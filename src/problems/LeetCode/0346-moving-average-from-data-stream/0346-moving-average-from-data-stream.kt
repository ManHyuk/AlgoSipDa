class MovingAverage(val size: Int) {
    val queue = LinkedList<Int>()

    fun next(`val`: Int): Double {
        if (queue.size >= size) queue.removeFirst()
        queue.addLast(`val`)
        return queue.sum().toDouble() / queue.size
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * var obj = MovingAverage(size)
 * var param_1 = obj.next(`val`)
 */