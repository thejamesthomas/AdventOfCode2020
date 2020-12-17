import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

internal class day2problem1Test {

    @Test
    fun solve_shouldIdentifyOneCorrectPassword() {
        val actual = day2problem1().solve(listOf("1-3 a: abcde"))

        assertEquals(1, actual)
    }

    @Test
    fun solve_shouldNotIdentifyAnIncorrectPassword() {
        val actual = day2problem1().solve(listOf("1-3 a: abcdeaaa"))

        assertEquals(0, actual)
    }

    @Test
    fun solve_shouldIdentifyMultipleCorrectPasswordsAdmidstIncorrectPasswords() {
        val actual = day2problem1().solve(listOf("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc", "1-3 a: abcdeaaa"))

        assertEquals(2, actual)
    }

    @Test
    fun solve_shouldWorkOnGivenInput() {
        val input = File(javaClass.getResource("day2problem1Input.txt").toURI()).readLines()
        val actual = day2problem1().solve(input)

        assertEquals(628, actual)
    }
}