package com.erikaosgue.course2masterclass.standardFunctions

/**
 * 1. Car Exercise
 *
 * 2. A lock object needs a key object to unlock After creating a key,
 * we must define the key secret code and call the carve function implement the lock,
 * then call the unlock function with a disposable key (no need to store the key in a variable)
 *
 */

fun main() {
    /*** 1 ***/
    println(" ====== 1. Car Exercise ======\n")
    val myCar :MyCar = MyCar().apply {
        speed = 50
        color = "red"
        startCar()
    }

    /** 2 **/
    println("\n====== 2. Key and Lock Exercise ======\n")
    // Using RUN
    /*Lock().unlock(
        Key().run {
            secretCode = "1234"
            carve()
            this
        }

    )*/
    Lock().unlock(
        Key().apply {
            secretCode = "1234"
            carve()
        }

    )

}

/** 1 **/
class MyCar {

    var speed = 10
    var color = "blue"
    fun startCar() {
        println("Starting the Car speed $speed. Color is $color")

    }
}

/** 2 **/
class Lock {

    fun unlock(key: Key){

    }
}

class Key {
    var secretCode = "1234"
    fun carve () {
        println("Carving the key with code $secretCode")
    }
}
