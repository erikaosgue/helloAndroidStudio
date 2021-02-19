package com.erikaosgue.helloandroidstudio


fun main(args: Array<String>){
    var myString = "Hello World!"
    println(myString)

    // #### Arrays ###### //

    // arrayOf Can't be change the length
    val states1 = arrayOf("Texas", "Illinois", "Iowa", "California")

    // Also could be assign any data type in the array
    val mixed = arrayOf("Erika", 1, 2.3, false)
    mixed[2] = 3.1426 // This is possible, I cant change the value of one element in the array

    // intArrayOf  only should contain list of integers
    val listOfNumbers = intArrayOf() //Just numbers

    // doubleArrayOf should only contain list of Doubles
    val ListofDoubles = doubleArrayOf() //Juts Doubles

    // Concatenation of arrays
    val states2 = arrayOf("Idaho", "florida")
    val allStates = states1 + states2
    println("==> ${allStates}")
    // Double colon is a reference to a function or to class
    // What really means?
    allStates.forEach(::println)
    println(allStates.map(String::length))


    //Get the size of the array
    val size = allStates.size

    //Check if the array is empty
    val empty: Boolean = allStates.isEmpty()

    // check if a value is in the array
    val result = allStates.contains("Kentucky")
    println(result)

    // #### Lists ###### //
    val arrayList = arrayListOf("Erika", "Michael", "Sarah")



}