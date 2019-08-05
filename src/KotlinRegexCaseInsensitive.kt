package me


fun main() {

    val words = listOf("dog", "Dog", "DOG", "Doggy")

    val pattern = "dog".toRegex(RegexOption.IGNORE_CASE)

    words.forEach { word ->
        if (pattern.matches(word)) {
            println("$word matches")

        }
    }
}