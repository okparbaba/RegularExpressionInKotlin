package me

fun main() {

    val words = listOf("a gray bird", "grey hair", "great look")

    val pattern = "gr[ea]y".toRegex()

    words.forEach { word ->

        if (pattern.containsMatchIn(word)) {

            println("$word")
        }
    }
}