class day1problem1 {
    fun solve(input: List<Int>): Int {
        for (i in input.indices) {
            for (j in input.indices) {
                if (i == j) continue
                if (input[i] + input[j] == 2020)
                    return input[i] * input[j]
            }
        }
        return -1
    }
}