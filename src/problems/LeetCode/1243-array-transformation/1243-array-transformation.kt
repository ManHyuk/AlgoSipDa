class Solution {
    fun transformArray(arr: IntArray): List<Int> {
        var equalsToPrevArray = false
        
        while (!equalsToPrevArray) {
            equalsToPrevArray = true
            var i = 1
            
            var prevNum = arr[0]
            var currNum = arr[1]
            
            while (i < arr.size - 1) {
                currNum = arr[i]
                
                if (currNum > prevNum && currNum > arr[i+1])
                    arr[i] -= 1
                
                if (currNum < prevNum && currNum < arr[i+1])
                    arr[i] += 1
                
                if (currNum != arr[i]) {
                    prevNum = currNum
                    equalsToPrevArray = false
                } else
                    prevNum = arr[i]
                
                i++
            }
        }
        
        return arr.toList()
    }
}