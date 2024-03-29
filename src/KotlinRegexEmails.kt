package me

fun main() {

    val emails = listOf("luke@gmail.com", "andy@yahoocom",
        "34234sdfa#2345", "f344@gmail.com", "dandy!@yahoo.com")

    val pattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,18}".toRegex()

    emails.forEach { email ->

        if (pattern.matches(email)) {

            println("$email matches")
        } else {

            println("$email does not match")
        }
    }
}