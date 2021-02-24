package com.erikaosgue.helloandroidstudio.IIobjectOrientedProgramming

class Animal {
    var age: Int = 0

        // Implementing a custom getter and setter for age
        get() = field
        set(value) {
           if(value >=0) {
               field = value
           }else {
               println("you only can set a value greater than 0")
           }
        }

    // IMMUTABLE get
    val name = ""
        get() = field
        /*set(value) {
            //This is an error because this is not
            //mutable variable
        }*/


}

// PRIVATE CLASSES
// PROTECTED CLASSES - WITH OPEN CLASS

open class Animal2 {

    // PRIVATE variable
    // var age will be only available inside the class
    private var age: Int = 0

    // PROTECTED variable should be use in Open in classes
    // Are available for the subclasses and
    // inside the class
    protected var name = "Sam"


    //INTERNAL variable
    // can be access anywhere inside the module
    // in this project the app is the module
    internal val isDangerous = true

    //PUBLIC has complete access to the class
     public fun isOld(): Boolean {
        println("Using the PUBLIC method")
         return age > 12
     }


    /*fun isOld(): Boolean {
        println("Using the final method")
        return age > 12
    }*/

}

class Vertebrate: Animal2(){
    fun introduceYourself() {
        println("We can use Protected method here in the subclass ${this.name}")
        println("We can't use Private method here in the subclass => this.age will not be recognized")
    }

}

fun main(args: Array<String>) {

    val animal = Animal()
    // [animal.age = 9] is calling the setter internally,
    // even if we don't see it
    animal.age = 9

    //The setter should handle this
    animal.age = -2

    // [animal.age] is calling the getter
    println("animal.age: ${animal.age}")




    /**** SETTERS AND GETTERS *****/

    /*NOTE:
    *
    * val => Don't have SETTERS because the are immutable,
    * val only have getters
    *
    * var => Do have default implementation of
    * setters and getters because they are mutable
    * */


    /**** VISIBILITIES *****/

    val animal2 = Animal2()

    // animal2.name // error // PROTECTED
    // animal2.age  // error // PRIVATE
    animal2.isDangerous     // INTERNAL
    animal2.isOld()         // PUBLIC METHOD





}