package me

fun main() {

    val text = "We met in 2013. She must be now about 27 years old."

    val pattern = "\\d+".toRegex()
    val found = pattern.findAll(text)

    found.forEach { f ->
        val m = f.value
        println("$m")
    }
}