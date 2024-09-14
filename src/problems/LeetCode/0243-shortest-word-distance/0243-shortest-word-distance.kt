class Solution {
    fun shortestDistance(wordsDict: Array<String>, word1: String, word2: String): Int {
       
       var i = -1
       var j = -1
       var minDistance = wordsDict.size
       var idx = 0
       for(word in wordsDict) {
           if(word == word1) {
               i = idx
           } else if(word == word2) {
               j = idx
           }
           idx++

           if( i != -1 && j != -1) {
               minDistance = Math.min(minDistance, Math.abs(i - j))
           }
       }
       return minDistance
    }

    
}