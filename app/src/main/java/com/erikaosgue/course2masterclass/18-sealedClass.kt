package com.erikaosgue.course2masterclass

import kotlin.random.Random

fun main() {

    for (i in 1..5) {

        var vehicle = getVehicle()
        when (vehicle) {
            is Car -> println("A car is faster")
            is Bicycle -> println("A bike is more healty")
        }
    }

}
// Setting always pegasus as a default Vehicle
//fun getVehicle(): Vehicle  = Pegasus()

// Using random to get a Random vehicle
fun getVehicle(): Vehicle {
    if (Random.nextInt(5) % 2 == 0) {
        return Pegasus()
    }
    return BMW()
}

abstract class Vehicle

sealed class Car: Vehicle()
sealed class Bicycle: Vehicle()

class BMW: Car()

class Pegasus: Bicycle()

