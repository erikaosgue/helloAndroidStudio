package com.erikaosgue.course2masterclass

import java.lang.IllegalStateException

fun main() {

    /*** try and catch structure ****/
   /* try {
        // try something
    }catch (e: Exception) {
        //if an exception occurs do this
    }finally {
        //always execute this part
    }*/


    /***** try , catch and Finally Example ****/

    println("Enter some text: ")
    print("=> ")
    val test = readLine()

    try {
        // Is the input is not a Number the exception Will happened
        println(test?.toInt())

    }catch (e: Exception) {
        // Allow the system print out the message and not show it to hte user
        e.printStackTrace()
        println("An exception happened \n[${e.localizedMessage}]")
    }
    finally {
        // Finally block is important to free out the resources
        // This will be executed whenever an exception occurs or not!
        println("The execution has completed")
    }


    /*************** Throw ************/

    var input = readLine()
    throw  IllegalStateException("I don't like this input")
}