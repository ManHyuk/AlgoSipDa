class TwoSum() {
    val map = mutableMapOf<Int, Int>()

    fun add(number: Int) {
        map[number] = (map[number] ?: 0) + 1
    }

    fun find(value: Int): Boolean {
        map.forEach { (n, count) ->
            val diff = value - n
            if (map.contains(diff) && (diff != n || count > 1)) return true
        }
        return false
    }

}

/**
 * Your TwoSum object will be instantiated and called as such:
 * var obj = TwoSum()
 * obj.add(number)
 * var param_2 = obj.find(value)
 */