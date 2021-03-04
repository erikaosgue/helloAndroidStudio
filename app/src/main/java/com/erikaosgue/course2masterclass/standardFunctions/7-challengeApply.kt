package com.erikaosgue.course2masterclass.standardFunctions

/**
 *Exercise: Apply
A coffee shop serves cups of coffee.
A cup of coffee has a client name and a method for preparing the coffee.
Read a client name from the console, then call the sellCoffee
method of the coffee shop. Create a coffee cup object,
initialise it and serve it to the client.
 *
 */

fun main() {

    println("Enter name of the Client")
    var name = readLine()?:""

    CoffeeShop().sellCoffee(name)


}

class CoffeeShop {
    fun sellCoffee(name: String) {
        CoffeeCup().apply {
            clientName = name
            prepareCoffee()
            println("Serving a cup of coffe to $name")
            println(this)
        }

    }
}

class CoffeeCup {
    var clientName = ""
    fun prepareCoffee() {
        println("Brewing the Coffee")
    }

}