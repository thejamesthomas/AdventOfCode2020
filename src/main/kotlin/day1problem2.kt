class day1problem2 {
    fun solve(input: List<Int>): Int {
        for (i in input.indices) {
            for (j in input.indices) {
                for (k in input.indices) {
                    if (i == j || j == k || i == k) continue
                    if (input[i] + input[j] + input[k] == 2020)
                        return input[i] * input[j] * input[k]
                }
            }
        }
        return -1
    }
}