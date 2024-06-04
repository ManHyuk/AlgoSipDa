class Logger() {
    var map = hashMapOf<String, Int>()
    fun shouldPrintMessage(timestamp: Int, message: String): Boolean {
        if (!map.containsKey(message)) {
            map[message] = timestamp
            return true
        } else {
            if (timestamp - map.get(message)!! < 10) {
                return false
            } else {
                map[message] = timestamp
                return true
            }
        }
    }

}

/**
 * Your Logger object will be instantiated and called as such:
 * var obj = Logger()
 * var param_1 = obj.shouldPrintMessage(timestamp,message)
 */

/**
 * Your Logger object will be instantiated and called as such:
 * var obj = Logger()
 * var param_1 = obj.shouldPrintMessage(timestamp,message)
 */