package me


fun main() {

    val text = "I saw a fox in the wood. The fox had red fur."

    val pattern = "fox".toRegex()

    val found = pattern.findAll(text)

    found.forEach { f ->
        val m = f.value
        val idx = f.range
        println("$m found at indexes: $idx")
    }
}