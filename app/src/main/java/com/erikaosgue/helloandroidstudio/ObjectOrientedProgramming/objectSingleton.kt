package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming


//Lesson 45. Objects/Singletons

//object will be just one instance of the class

object Cache {
    const val name = "HyperCahe"

    fun retrieveDate():Int {
        println("I am retrieving data from Cache Object")
        return 0
    }
}

fun main(args: Array<String>) {
    Cache.retrieveDate()
}

