import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class day3problem2Test {

    @Test
    fun solve_shouldWorkOnGivenInput() {
        val rawInput = File(javaClass.getResource("day3problem2Input.txt").toURI()).readLines()
        val input: Array<CharArray> = rawInput.map {
            it.toCharArray()
        }.toTypedArray()

        val actual = day3problem2().solve(input)

        assertEquals(3492520200, actual)
    }
}