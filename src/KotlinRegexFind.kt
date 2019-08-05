package me


fun main() {

    val text = "I saw a fox in the wood. The fox had red fur."

    val pattern = "fox".toRegex()

    val found = pattern.find(text)

    val m = found?.value
    val idx = found?.range

    println("$m found at indexes: $idx")

    val found2 = pattern.find(text, 11)

    val m2 = found2?.value
    val idx2 = found2?.range

    println("$m2 found at indexes: $idx2")
}