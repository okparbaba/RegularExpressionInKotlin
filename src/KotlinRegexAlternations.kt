package me

fun main() {

    val words = listOf("Jane", "Thomas", "Robert",
        "Lucy", "Beky", "John", "Peter", "Andy")

    val pattern = "Jane|Beky|Robert".toRegex()

    words.forEach { word ->

        if (pattern.matches(word)) {

            println("$word")
        }
    }
}