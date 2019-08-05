package me

fun main() {

    val words = listOf("pen", "book", "cool", "pencil", "forest", "car",
        "list", "rest", "ask", "point", "eyes")

    val pattern = "\\w{3,4}".toRegex()

    words.forEach { word ->
        if (pattern.matches(word)) {

            println("$word matches")
        } else {
            println("$word does not match")
        }
    }
}