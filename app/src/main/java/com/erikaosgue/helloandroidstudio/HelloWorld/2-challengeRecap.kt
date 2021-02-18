package com.erikaosgue.helloandroidstudio


/*
Create an array list of your favorite book titles. Loop over this list and, if
the title contains the letter ‘e’, print each character of the name on a new
line.
*/

fun main() {

    val array = arrayOf("the book thief", "El olvido que seremos", "Diario de Ana Frank")
    for (title in array) {
        if(title.contains("e")) {
            for(char in title) {
                println(char)
            }
        }
    }

}