class MyHashSet() {
    private var ds = BooleanArray(1_000_001)
    fun add(key: Int) { this.ds[key] = true }
    fun remove(key: Int) { this.ds[key] = false }
    fun contains(key: Int) = this.ds[key]
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */