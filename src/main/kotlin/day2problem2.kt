class day2problem2 {
    fun solve(input: List<String>): Int {
        return input.count {
            val match = Regex("(\\d+)-(\\d+) (\\w): (\\w+)").find(it)!!

            val (requirementFirstPositionString, requirementSecondPositionString, requirementCharacter, stringToValidate) = match.destructured
            val requirementFirstPositionIndex = Integer.parseInt(requirementFirstPositionString) - 1
            val requirementSecondPositionIndex = Integer.parseInt(requirementSecondPositionString) - 1

            val firstPositionCharacter = stringToValidate[requirementFirstPositionIndex]
            val secondPositionCharacter = stringToValidate[requirementSecondPositionIndex]
            (firstPositionCharacter == requirementCharacter[0]) xor (secondPositionCharacter == requirementCharacter[0])
        }
    }
}