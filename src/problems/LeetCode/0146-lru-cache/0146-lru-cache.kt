class LRUCache(capacity: Int) {
    private val cache = object : LinkedHashMap<Int, Int>(capacity + 1) {
        override fun removeEldestEntry(eldest: Map.Entry<Int, Int>) = size > capacity
    }

    fun get(key: Int) = cache.remove(key)?.also { cache[key] = it } ?: -1

    fun put(key: Int, value: Int) {
        cache.remove(key)
        cache[key] = value
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */