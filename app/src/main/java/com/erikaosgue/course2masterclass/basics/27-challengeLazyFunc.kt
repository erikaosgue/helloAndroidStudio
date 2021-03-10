package com.erikaosgue.course2masterclass

/** Exercise: lazy
 * An object of a class NewUser is created for each new user.
 * It contains a function to print a welcome message.In your program,
 * you have a list of banned usernames.
 * Ask the user to input their desired username.
 * If it is not part of the list, create the NewUser object and
 * print the welcome message.
 */


fun main() {


    val newUser by  lazy {NewUser()}

    val listZOfBannedUsers = getBannedUsers()
    println("Please enter your name: ")

    val name = readLine()?:""
    if (name == "") {
        println("Name should not be empty")
        return
    }
    if (!listZOfBannedUsers.contains(name.toLowerCase())){
        newUser.printMessage()
    }
    else
        println("You are banned")
}

class NewUser() {

    fun printMessage() {
        println("Welcome to you !!!")
    }
}

fun getBannedUsers(): List<String> {

    var bannedUsers = arrayListOf<String>("erika", "andrea", "sami")
    return bannedUsers

}