package me

fun main() {

    val content = """<p>The <code>Pattern</code> is a compiled
representation of a regular expression.</p>"""

    val pattern = "(<\\/?[a-z]*>)".toRegex()

    val found = pattern.findAll(content)

    found.forEach { f ->
        val m = f.value
        println("$m")
    }
}