package me


fun main() {

    val words = listOf("seven", "even", "prevent", "revenge", "maven",
        "eleven", "amen", "event")

    val pattern = "..even".toRegex()

    words.forEach { word ->
        if (pattern.containsMatchIn(word)) {
            println("$word matches")

        }
    }
}