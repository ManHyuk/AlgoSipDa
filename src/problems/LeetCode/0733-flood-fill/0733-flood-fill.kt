class Solution { 
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        return helper(image, sr, sc, color, image[sr][sc])
    }

    fun helper(image: Array<IntArray>, sr: Int, sc: Int, color: Int, prevColor: Int): Array<IntArray> {
        if(sr < 0 || sr > image.size-1) return image
        if(sc > image[0].size-1 || sc < 0) return image
        if(image[sr][sc] != prevColor) return image
        if(image[sr][sc] == color) return image
        

        val prevColor = image[sr][sc]
        image[sr][sc] = color

        helper(image, sr, sc+1, color, prevColor)
        helper(image, sr, sc-1, color, prevColor)
        helper(image, sr-1, sc, color, prevColor)
        helper(image, sr+1,sc, color, prevColor)
        return image
    }
}