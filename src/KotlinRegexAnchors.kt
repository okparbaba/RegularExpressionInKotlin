package me


fun main() {

    val sentences = listOf("I am looking for Jane.",
        "Jane was walking along the river.",
        "Kate and Jane are close friends.")

    val pattern = "^Jane".toRegex()

    sentences.forEach { sentence ->
        if (pattern.containsMatchIn(sentence)) {
            println("$sentence")

        }
    }
}