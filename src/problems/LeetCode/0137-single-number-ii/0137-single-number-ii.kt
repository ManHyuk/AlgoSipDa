class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = -1
        val repository = mutableListOf<Int>()
        var count = 0
        nums.forEach { it ->
            count ++
            if(result == it){
                if(!repository.contains(it)){
                    for (i in count until nums.size){
                        if (it == nums[i]){
                            repository.add(it)
                        } else { result = it}
                    }
                }
            } else {
                for (i in count until nums.size){
                        if (it == nums[i]){
                            repository.add(it)
                        }
                    }
                if(!repository.contains(it)){
                    result = it
                }
            }
        }
        return result
    }
}