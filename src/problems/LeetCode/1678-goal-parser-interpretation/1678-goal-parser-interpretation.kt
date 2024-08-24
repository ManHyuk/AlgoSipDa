class Solution {
    fun interpret(command: String) = command.replace("()", "o" ).replace("(al)", "al")
}