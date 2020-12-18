class day3problem1 {
    private val deltaY = 1
    private val deltaX = 3
    private val treeCharacter = '#'

    fun solve(input: Array<CharArray>): Int {
        var currentX = 0
        var currentY = 0
        var treeImpactCount = 0

        val columnSize = input[0].size
        while(currentY < input.size) {
            if(input[currentY][currentX % columnSize] == treeCharacter)
                treeImpactCount++

            currentX += deltaX
            currentY += deltaY
        }

        return treeImpactCount
    }
}