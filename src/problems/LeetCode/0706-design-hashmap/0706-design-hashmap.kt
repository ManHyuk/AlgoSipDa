class MyHashMap {
    private val size: Int = 100001
    private val buckets = Array(size) { mutableListOf<Pair<Int, Int>>() }

    fun put(key: Int, value: Int) {
        val bucket = getBucket(key)
        getPair(key)?.let {
            bucket.remove(it)
            bucket.add(it.copy(second = value))
        } ?: bucket.add(Pair(key, value))
    }

    fun get(key: Int): Int = getPair(key) ?.second ?: -1

    fun remove(key: Int) = getPair(key) ?.let { getBucket(key).remove(it) }

    private fun getBucket(key: Int): MutableList<Pair<Int, Int>> = buckets[hash(key)]

    private fun getPair(key: Int): Pair<Int, Int>? = getBucket(key).find { it.first == key }

    private fun hash(key: Int): Int = key % size
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */