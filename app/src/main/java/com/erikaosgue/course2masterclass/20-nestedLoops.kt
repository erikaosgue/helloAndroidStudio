package com.erikaosgue.course2masterclass


fun main() {
    val myCar = Car3()
    myCar.Engine().run()
}


//Accessing the outer class from the inner object using this@ClassName
class Car3 {


    var speed = 10
    fun drive() {
        println("Driving at speed $speed")
    }

    inner class Engine {
        val rpm = 1000
        fun run() {
            println("Engine is running at $rpm rpm")

            // Access the outer class inside the inner class
            this@Car3.speed = 150
            this@Car3.drive()
        }
    }
}

// Accessing the inner object from the outer Class
class Car4 {

    private val engine = Engine()
    var speed = 10
    fun drive() {
        engine.run()
        println("Driving at speed $speed")
    }


    private inner class Engine {
        val rpm = 1000
        fun run() {
            println("Engine is running at $rpm rpm")

            // Access the outer class inside the inner class
            this@Car4.speed = 150
        }
    }
}