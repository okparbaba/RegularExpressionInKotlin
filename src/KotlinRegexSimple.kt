package me
fun main() {

    val words = listOf("book", "bookworm", "Bible",
        "bookish","cookbook", "bookstore", "pocketbook")

    val pattern = "book".toRegex()

    println("*********************")
    println("containsMatchIn function")

    words.forEach { word ->
        if (pattern.containsMatchIn(word)) {
            println("$word matches")
        }
    }

    println("*********************")
    println("matches function")

    words.forEach { word ->
        if (pattern.matches(word)) {
            println("$word matches")
        }
    }
}

//In the example, we use the matches() and containsMatchIn() methods.
// We have a list of words. The pattern will look for a 'book' string
// in each of the words using both methods.

//val pattern = "book".toRegex()


//A regular expression pattern is created with toRegex() method.
// The regular expression consists of four normal characters.
//
//words.forEach { word ->
//    if (pattern.containsMatchIn(word)) {
//        println("$word matches")
//    }
//}