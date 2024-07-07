class RandomizedSet() {
    val randomSet:MutableSet<Int> = mutableSetOf()
    fun insert(`val`: Int): Boolean {
        return randomSet.add(`val`)

    }

    fun remove(`val`: Int): Boolean {
        return randomSet.remove(`val`)
    }

    fun getRandom(): Int {
        return randomSet.random()
    }

}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */