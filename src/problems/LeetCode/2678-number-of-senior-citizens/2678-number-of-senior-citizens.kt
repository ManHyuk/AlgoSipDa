class Solution {
    fun countSeniors(details: Array<String>): Int = 
        details.count { it.drop(11).take(2).toInt() > 60 }
}