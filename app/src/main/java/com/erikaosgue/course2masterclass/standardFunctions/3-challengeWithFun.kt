package com.erikaosgue.course2masterclass.standardFunctions

/**
Exercise: With
A store has a supply of shoes, shirts and jackets,
as well as a method to print out the inventory.
Create a variable of type store, update its stock and
print out the inventory.
*/

fun main() {

//Create the object and update the stock
    println("====== Store Object =======\n")
    with(Store()) {
        shoes = 25
        shirts = 10
        jackets = 43

        printInventory()
    }

}


class Store {
    var shoes = 10
    var shirts = 20
    var jackets = 30

    fun printInventory() {
        println("The store has $shoes pairs of shoes, $shirts shirts, $jackets jackets. ")
    }
}