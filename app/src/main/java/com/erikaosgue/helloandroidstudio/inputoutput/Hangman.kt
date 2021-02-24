package com.erikaosgue.helloandroidstudio.inputoutput

// Game Hangmain (Ahorcado)
// Guess the word
// Example: tree
// _ _ _ _


fun main(args: Array<String>) {

    /********  First User ***********/

    print("Enter the word to guess: ")
    val word: String? = readLine()
    if (word == null) {
        println("No word given, game ended")
        return
    }

    // Print 100 new lines
    for (i in 1..100) {
        println()
    }

    /********  Second User ***********/
    //  word = "Tree"
    // .toLowerCase() = "tree"
    // .toCharArray = ['t', 'r', 'e', 'e']
    // .toHashSet() = ['t', 'r', 'e']
    // letters = ['t', 'r', 'e']
    val letters = word.toLowerCase().toCharArray().toHashSet()

    val correctGuesses = mutableSetOf<Char>()

    var fails: Int = 0

    while(letters != correctGuesses) {


        //print the word that has been guess so far
        printlnExploredWord(word, correctGuesses)
        println("\n#Wrong guesses: $fails\n\n")

        // Asking the user to enter one character
        print("Guess letter: ")
        var char: String? = readLine()


        // Validation of not null input
        if (char == null) {
            continue
        } else if (char.length != 1) {
            println("Please enter one letter")
            continue
        }

        // Checking if the word contains the char the user enter
        // If True, add the char into the set of correctGuesses
        // word = 'tree'
        // char = 't'
        if (word.toLowerCase().contains(char.toLowerCase())) {
            correctGuesses.add(char[0].toLowerCase())
        } else {
            fails++
        }
    }

    println("*** Well done! ****")
    printlnExploredWord(word, correctGuesses)
    println("\n#Wrong guesses: $fails\n\n")
    println("Bye Bye!")



}

fun printlnExploredWord(word: String, correctGuesses: Set<Char>) {

    for (char in word.toLowerCase()) {
        if (correctGuesses.contains(char)) {
            print("$char ")
        }
        else {
            print("_ ")
        }
    }
}