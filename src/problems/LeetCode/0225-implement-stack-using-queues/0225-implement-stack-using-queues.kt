
class MyStack: Queue<Int> by LinkedList() {
    fun push(x: Int) {
      add(x)
      repeat(size - 1) { add(pop()) } 
    }
    fun pop() = remove()
    fun top() = first()
    fun empty() = isEmpty()
}