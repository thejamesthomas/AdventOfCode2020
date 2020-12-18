import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class day2problem2Test {

    @Test
    fun solve_shouldCountACorrectPassword() {
        val actual = day2problem2().solve(listOf("1-3 a: abcde"))

        assertEquals(1, actual)
    }

    @Test
    fun solve_shouldNotCountInvalidPasswords() {
        val actual = day2problem2().solve(listOf("1-3 b: cdefg"))

        assertEquals(0, actual)
    }

    @Test
    fun solve_shouldNotCountInvalidPasswords2() {
        val actual = day2problem2().solve(listOf("2-9 c: ccccccccc"))

        assertEquals(0, actual)
    }

    @Test
    fun solve_shouldWorkOnGivenInput() {
        val input = File(javaClass.getResource("day2problem2Input.txt").toURI()).readLines()
        val actual = day2problem2().solve(input)

        assertEquals(705, actual)
    }
}