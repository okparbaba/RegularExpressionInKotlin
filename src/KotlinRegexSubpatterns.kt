package me


fun main() {

    val words = listOf("book", "bookshelf", "bookworm",
        "bookcase", "bookish", "bookkeeper", "booklet", "bookmark")

    val pattern = "book(worm|mark|keeper)?".toRegex()

    words.forEach { word ->

        if (pattern.matches(word)) {

            println("$word matches")
        } else {

            println("$word does not match")
        }
    }
}