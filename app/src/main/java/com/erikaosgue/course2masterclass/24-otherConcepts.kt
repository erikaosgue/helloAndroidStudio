package com.erikaosgue.course2masterclass

/**
 * The exercise of the car depends of the hierarchy
 * (One BMW can be a car but not all Car are BMW)
 * an object define with the type Car could have an
 * object of type Car of BMW, but to be able to change the type
 * Example:
 * a Type BMW -(can be)----> Car
 * a type Car -(can't be)--> BMW
 *
 *
 * But an object define with a type BMW can only be of type
 * BMW it can't be of type Car
 * Example:
 * a Type BMW -(can be)----> Car
 */

fun main() {

    // Using the is keyword
    val value = "Testing my strings"
    if (value is String)
        println("This string has ${value.length} characters")

    //----- Using as keyword -------

    // myCar could be of Type Car1 or BMW1
    val myCar: Car1 = getCar()
    println("Class Name: ${myCar::class.simpleName}")

    if (myCar !is BMW1) {
        println("This is not a BMW car")
        // (myCar as BMW1).drive() // Error Because the type of the Object is Car

    }

    //myCar.drive() // Error => Solution using as?
    //(myCar as BMW1).drive() // Error Exception java.lang.ClassCastException

    if (myCar is BMW1) {
        // Transforming from a Car Type to a BMW type
        myCar.drive()
        (myCar as BMW1).drive()

    }
    val myBMW: BMW1 = getBMW()
    // Transforming from BMW type to a Car type
    (myBMW as Car1).print()

    //----- --Using as? a solution to Problem of the Exception or avoiding to ask first---------------/

    val bmwCar = myCar as? BMW1
    println("\nOutput of myCar as? BMW1:")
    bmwCar?.drive()


}

open class Car1 {
    fun print() {
        print("This is a Car")
    }
}

class BMW1: Car1() {
    fun drive() {
        println("Driving my BMW")
    }
}
fun getCar(): Car1 = Car1()
//fun getCar(): Car1 =  BMW1()
fun getBMW(): BMW1 = BMW1()

