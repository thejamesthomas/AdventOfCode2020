class day3problem2 {
    private val slopes = listOf(
        Pair(1,1),
        Pair(1,3),
        Pair(1,5),
        Pair(1,7),
        Pair(2,1),
    )

    private val treeCharacter = '#'

    fun solve(input: Array<CharArray>): Long {
        val computedPaths = slopes.map { slope ->
            generateSequence(Pair(0, 0), { Pair(it.first + slope.first, it.second + slope.second) })
        }

        val columnSize = input[0].size
        val maxRowSize = input.size
        val countsOfTreeImpactsForAllPaths = computedPaths.map { sequence ->
            sequence.takeWhile { it.first < maxRowSize }
                .count { currentCoordinate -> input[currentCoordinate.first][currentCoordinate.second % columnSize] == treeCharacter }
        }

        return countsOfTreeImpactsForAllPaths.fold(1, {current, next -> current * next})
    }
}