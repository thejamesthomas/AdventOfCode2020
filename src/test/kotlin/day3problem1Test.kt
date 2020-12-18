import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class day3problem1Test {

    @Test
    fun solve_shouldSayWeBumpIntoATreeForASimpleCase() {
        val input = arrayOf(
            charArrayOf('.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '#')
        )

        val actual = day3problem1().solve(input)

        assertEquals(1, actual)
    }

    @Test
    fun solve_shouldSayWeBumpIntoTheCorrectNumberOfTreesForAMoreComplexCase() {
        val input = arrayOf(
            "..##.......".toCharArray(),
            "#...#...#..".toCharArray(),
            ".#....#..#.".toCharArray(),
            "..#.#...#.#".toCharArray(),
            ".#...##..#.".toCharArray(),
            "..#.##.....".toCharArray(),
            ".#.#.#....#".toCharArray(),
            ".#........#".toCharArray(),
            "#.##...#...".toCharArray(),
            "#...##....#".toCharArray(),
            ".#..#...#.#".toCharArray()
        )

        val actual = day3problem1().solve(input)

        assertEquals(7, actual)
    }

    @Test
    fun solve_shouldWorkOnGivenInput() {
        val rawInput = File(javaClass.getResource("day3problem1Input.txt").toURI()).readLines()
        val input: Array<CharArray> = rawInput.map {
            it.toCharArray()
        }.toTypedArray()

        val actual = day3problem1().solve(input)

        assertEquals(178, actual)
    }
}