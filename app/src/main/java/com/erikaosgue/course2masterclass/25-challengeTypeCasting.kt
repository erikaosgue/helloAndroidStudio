package com.erikaosgue.course2masterclass

import kotlin.random.Random


/**
 *
 * Exercise: type casting
 * The classes Cat and Dog inherit from an abstract class Animal.
 * The Cat class has a function purr() and the Dog class has a function bark()
 * A function provides a list of animals, that are randomly distributed.
 * Design a program that invokes each respective function of each type of Animal from the list.


 *
 */
fun main() {

    var string: String


    val animals: ArrayList<Animal> = getAnimals()
    println(" Class type: ${animals::class.simpleName}")

    animals.forEach { animal ->

        (animal as? Cat)?.purr()
        (animal as? Dog)?.bark()

    }

}

abstract class Animal


class Cat: Animal() {
    fun purr() {
        println("Cat is purring")
    }

}

class Dog: Animal() {
    fun bark() {
        println("Dog is barking")
    }

}

fun getAnimals(): ArrayList<Animal> {
    val listAnimals = arrayListOf<Animal>()
    for(i in 1..6){
        listAnimals.add(
                if(Random.nextInt() % 2 == 0)
                    Cat()
                else
                    Dog()
        )
    }
    return listAnimals
}