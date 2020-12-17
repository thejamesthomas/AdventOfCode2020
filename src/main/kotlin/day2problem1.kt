class day2problem1 {
    fun solve(input: List<String>): Int {
        return input.count {
            val match = Regex("(\\d+)-(\\d+) (\\w): (\\w+)").find(it)!!

            val (requirementMinCountString, requirementMaxCountString, requirementCharacter, stringToValidate) = match.destructured
            val requirementMinCount = Integer.parseInt(requirementMinCountString)
            val requirementMaxCount = Integer.parseInt(requirementMaxCountString)

            val numberOfCharacters: Int = stringToValidate.count { char -> char.toString() == requirementCharacter }

            numberOfCharacters in requirementMinCount..requirementMaxCount
        }
    }
}