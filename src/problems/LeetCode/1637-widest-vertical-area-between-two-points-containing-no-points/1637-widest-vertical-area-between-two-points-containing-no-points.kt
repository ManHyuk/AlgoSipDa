class Solution {
fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
    return points
        .map { it[0] }
        .sorted()
        .distinct()
        .zipWithNext { a, b -> b - a }
        .maxByOrNull { it }
        ?: 0
}
}